package co.elderbrother.in;

import java.io.IOException;
import java.util.Locale;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import co.elderbrother.in.dao.impl.RegistrationUserDto;
import co.elderbrother.in.model.RegisteredUser;
import co.elderbrother.in.model.VerificationToken;
import co.elderbrother.in.service.RegisterUserService;
import co.elderbrother.in.service.VerificationTokenService;




/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController    {
	
	@Autowired
	private RegisterUserService registerUserService;
	@Autowired
	private VerificationTokenService verificationTokenService;
	@Autowired
    private JavaMailSender mailSender;
	@Autowired
    private MessageSource messages;
	@Autowired
    private Environment env;
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpSession session) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

	    if (!(auth instanceof AnonymousAuthenticationToken))
	    {
	    	logger.info("home GET");
	        return "redirect:/LandingPage";
	    }else
		return "home";
	}
	@RequestMapping(value = "/LogIn", method = RequestMethod.GET)
	public String login(Model model,HttpSession session,HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "error", required = false) String error) {
		
		logger.info("login GET");
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

	    if (!(auth instanceof AnonymousAuthenticationToken))
	    {
	        return "redirect:/LandingPage";
	    }
		if (error != null) {
			
			logger.info("here"+ error.toString());
			model.addAttribute("error", "Invalid username and password!");
		}
 
		return "LogIn";
	}
	@RequestMapping(value = "/ForgotPassword", method = RequestMethod.GET)
	public String forgotPassword() {
		
		return "forgotPassword";
	}
	@RequestMapping(value = "/ForgotPassword", method = RequestMethod.POST)
	public String forgotPasswordSave(Model model) {
		//check if email exists
		return "forgotPassword";
	}
	
	@RequestMapping(value = "/Register", method = RequestMethod.GET)
	public String register(final HttpServletRequest request,final Model model) {
		final RegistrationUserDto accountDto = new RegistrationUserDto();
		model.addAttribute("registeringuser", accountDto);
		return "Register";
	}
	
	@RequestMapping(value = "/Registering", method = RequestMethod.POST)
	
	public String registerSave(@ModelAttribute("registeringuser") @Valid final RegistrationUserDto accountDto,final BindingResult result, final HttpServletRequest request,Model model) {
		String retview="Register";
		if(!result.hasErrors()){		
			logger.info("Registering: No errors");
			RegisteredUser registerdUser=registerUserService.getRegisterdUser(accountDto.getUsername());
			if(registerdUser ==null){
				final RegisteredUser validatedRegisteringuser = new RegisteredUser();
				validatedRegisteringuser.setFirstname(accountDto.getFirstname());
				validatedRegisteringuser.setLastname(accountDto.getLastname());
				validatedRegisteringuser.setUsername(accountDto.getUsername());
				validatedRegisteringuser.setPassword(accountDto.getPassword());
				validatedRegisteringuser.setCurrentclass(accountDto.getCurrentclass());
				validatedRegisteringuser.setSchool(accountDto.getSchool());
				validatedRegisteringuser.setAffiliation(accountDto.getAffiliation());
				validatedRegisteringuser.setCity(accountDto.getCity());
				validatedRegisteringuser.setConfirmed("N");
				registerUserService.add(validatedRegisteringuser);
				
				final String appUrl = "http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
				String token = UUID.randomUUID().toString();
		        VerificationToken verificationToken= new VerificationToken(token,validatedRegisteringuser);
		        verificationTokenService.add(verificationToken);
		        
		        final String recipientAddress = validatedRegisteringuser.getUsername();
		        final String subject = "Registration Confirmation:";
		        final String confirmationUrl = appUrl + "/regitrationConfirm.html?token=" + token;
		        final SimpleMailMessage email = new SimpleMailMessage();
		        email.setTo(recipientAddress);
		        email.setSubject(subject);
		        email.setText("Please confirm" + " \r\n" + confirmationUrl);
		        email.setFrom(env.getProperty("support.email"));
		        mailSender.send(email);
		        retview="RegisterConfirm";
        }else{
        	logger.info("Registering: Account exists");
        	model.addAttribute("error", "An account for that email already exists. Please enter a different email.");
        }
        	
	}
		logger.info("Server Error:Registration Page has errors");
		return retview;
	}
	
	@RequestMapping(value = "/regitrationConfirm", method = RequestMethod.GET)
    public String confirmRegistration(final Locale locale, final Model model, @RequestParam("token") final String token) {
        final VerificationToken verificationToken = verificationTokenService.findVerificationTokenByToken(token);
        if (verificationToken == null) {
           // final String message = messages.getMessage("auth.message.invalidToken", null, locale);
            model.addAttribute("msg", "Account Already confirmed. Please login");
            return "LogIn";
        }

        final RegisteredUser user = verificationToken.getUser();     
        		
       /* final Calendar cal = Calendar.getInstance();
        if ((verificationToken.getExpiryDate().getTime() - cal.getTime().getTime()) <= 0) {
            model.addAttribute("message", messages.getMessage("auth.message.expired", null, locale));
            model.addAttribute("expired", true);
            model.addAttribute("token", token);
            return "redirect:/badUser.html?lang=" + locale.getLanguage();
        }*/
       
        user.setConfirmed("Y");
        registerUserService.edit(user);
        verificationTokenService.delete(verificationToken.getId());
        //model.addAttribute("message", messages.getMessage("message.accountVerified", null, locale));
        //model.addAttribute("message", messages.getMessage("message.accountVerified", null, locale));
        return "LogIn";
    }
	
	/*@RequestMapping(value = "/LandingPage", method = RequestMethod.POST)
	public String LandingPage() throws IOException {	
		return "landingPage";
	}*/
	@RequestMapping(value = {"/LandingPage","/LandingPage/{id}"}, method = RequestMethod.GET)
	public String LandingPageGet(){	
		logger.info("landingpage:GET");
		return "landingPage";
	}
	@RequestMapping(value = {"/Support","/Support/{id}"}, method = RequestMethod.GET)
	public String support() {	
		return "Support";
	}
	@RequestMapping(value = {"/TableOfContent","/TableOfContent/{id}"}, method = RequestMethod.GET)
	public String tableOfContent() {	
		return "TableOfContent";
	}
	@RequestMapping(value = {"/tutorial","/tutorial/{id}"}, method = RequestMethod.GET)
	public String tutorialPage() {	
		return "tutorial";
	}
	@ModelAttribute("registeringuser")
    public RegistrationUserDto getForm() {
        return new RegistrationUserDto();
    }
	/*@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		
		this.eventpublisher=publisher;
	}*/
	
}
