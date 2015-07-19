package co.elderbrother.in.security;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import co.elderbrother.in.dao.RegisterUserDao;
import co.elderbrother.in.model.RegisteredUser;

@Service("userDetailsService")
@Transactional
public class MyUserDetailsService implements UserDetailsService {

	
	private static final Logger logger = LoggerFactory
            .getLogger(MyUserDetailsService.class);
    @Autowired
    private RegisterUserDao registerUserDao;
    /*@Autowired
    private IUserService service;*/
    @Autowired
    private MessageSource messages;
    /*@Autowired
    private RoleRepository roleRepository;*/

    @Autowired
    private LoginAttemptService loginAttemptService;

    @Autowired
    private HttpServletRequest request;

    public MyUserDetailsService() {
        super();
    }

    // API

    @SuppressWarnings("deprecation")
	@Override
    public UserDetails loadUserByUsername(final String email) throws UsernameNotFoundException {
    	logger.info("loadUserByUsername");
    	 /*String ip = request.getRemoteAddr();
       if (loginAttemptService.isBlocked(ip)) {
            throw new RuntimeException("blocked");
        }*/
        try {
            final RegisteredUser logginUser = registerUserDao.getRegisterdUser(email);      
            if (logginUser == null) {
            	logger.info("User Not found");
            	
               return new org.springframework.security.core.userdetails.User(" ", " ", true, true, true, true, null);
                
            }
            logger.info("username="+logginUser.getUsername()+" password="+logginUser.getPassword());
            boolean userConfirmedCheck =false;
            if(logginUser.getConfirmed().equalsIgnoreCase("Y")){
            	userConfirmedCheck=true;}
            
            Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			
				authorities.add(new GrantedAuthorityImpl("ROLE_ADMIN"));
				/*response.setHeader("Pragma", "no-cache");
			    response.setHeader("Cache-Control", "no-cache");
			    response.setDateHeader("Expires", 0);*/
		
           return new org.springframework.security.core.userdetails.User(logginUser.getUsername(), logginUser.getPassword(),userConfirmedCheck , true, true, true, authorities);
            
            /*org.springframework.security.core.userdetails.User securityUser = new 
					org.springframework.security.core.userdetails.User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
			return securityUser;*/
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    
}
