/*package co.elderbrother.in.registration;

import java.util.UUID;

import co.elderbrother.in.model.RegisteredUser;
import co.elderbrother.in.model.VerificationToken;
import co.elderbrother.in.service.VerificationTokenService;
import co.elderbrother.in.registration.OnRegistrationCompleteEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class RegistrationListener implements ApplicationListener<OnRegistrationCompleteEvent> {
    @Autowired
    private VerificationTokenService service;
    
    @Autowired
   private  ApplicationContext appContext;

    @Autowired
    private MessageSource messages;

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private Environment env;

    // API

    @Override
    public void onApplicationEvent(OnRegistrationCompleteEvent event) {
    	ApplicationContext context = event.getApplicationContext();
        this.confirmRegistration(event,event.getClass().getName());
       
        
    }

    private void confirmRegistration(OnRegistrationCompleteEvent event, String eventname) {
    	RegisteredUser user = event.getUser();
    	
    	
        String token = UUID.randomUUID().toString();
        VerificationToken verificationToken= new VerificationToken(token);
        verificationToken.setUser(user);
        service.add(verificationToken);

        final SimpleMailMessage email = constructEmailMessage(event, user, token,eventname);
        mailSender.send(email);
    }

    //

    private final SimpleMailMessage constructEmailMessage(final OnRegistrationCompleteEvent event, final RegisteredUser user, final String token, final String eventName) {
        final String recipientAddress = user.getUsername();
        final String subject = "Registration Confirmation: Event= "+eventName;
        final String confirmationUrl = event.getAppUrl() + "/regitrationConfirm.html?token=" + token;
        //final String message = messages.getMessage("message.regSucc", null, event.getLocale());
        final SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(recipientAddress);
        email.setSubject(subject);
        //email.setText(message + " \r\n" + confirmationUrl);
        email.setText("Please confirm" + " \r\n" + confirmationUrl);
        email.setFrom(env.getProperty("support.email"));
        return email;
    }

}
*/