/*package co.elderbrother.in.registration;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import co.elderbrother.in.model.RegisteredUser;

@Configurable
public class RegistrationEventPublisher implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher eventPublisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.eventPublisher = publisher;
		
	}
	public void publish(RegisteredUser user, Locale locale, String appUrl) {
	      OnRegistrationCompleteEvent reistrationComplentEvent = new OnRegistrationCompleteEvent( user,  locale,  appUrl);
	      publisher.publishEvent(reistrationComplentEvent);
	   }
	

}
*/