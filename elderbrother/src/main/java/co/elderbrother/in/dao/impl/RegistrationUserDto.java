package co.elderbrother.in.dao.impl;

import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;

import co.elderbrother.in.validation.PasswordMatches;
import co.elderbrother.in.validation.ValidEmail;

@PasswordMatches
public class RegistrationUserDto {
	
	@ValidEmail
	@NotNull 
	@NotEmpty  
	private String username;
	
	@NotNull 
	@NotEmpty
	private String firstname;
	
	@NotNull 
	@NotEmpty 
	private String lastname;
	
	@NotNull 
	@NotEmpty
	private String password;
	
	@NotNull
    @NotEmpty
    private String matchpassword;
	
	
	@NotNull 
	@NotEmpty 
	private String school;
	
	@NotNull 
	@NotEmpty
	private String affiliation;
	
	private String specialization;
	
	@NotNull 
	@NotEmpty
	private String city;
	
	private String confirmed;
	
	private String loggedin;
	
	@NotNull 
	@NotEmpty 
	private String currentclass;
	
	private String userType;

	
	
	
	 public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	public String getFirstname() {
		return firstname;
	}




	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}




	public String getLastname() {
		return lastname;
	}




	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getMatchpassword() {
		return matchpassword;
	}




	public void setMatchpassword(String matchpassword) {
		this.matchpassword = matchpassword;
	}




	public String getSchool() {
		return school;
	}




	public void setSchool(String school) {
		this.school = school;
	}




	public String getAffiliation() {
		return affiliation;
	}




	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}




	public String getSpecialization() {
		return specialization;
	}




	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	public String getConfirmed() {
		return confirmed;
	}




	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}




	public String getLoggedin() {
		return loggedin;
	}




	public void setLoggedin(String loggedin) {
		this.loggedin = loggedin;
	}




	public String getCurrentclass() {
		return currentclass;
	}




	public void setCurrentclass(String currentclass) {
		this.currentclass = currentclass;
	}




	public String getUserType() {
		return userType;
	}




	public void setUserType(String userType) {
		this.userType = userType;
	}




	@Override
	    public String toString() {
	        final StringBuilder builder = new StringBuilder();
	        builder.append("RegisteredUser [firstname=").append(firstname).append("]")
	        	   	.append("[lastname=").append(lastname).append("]")
	        	   	.append("[username").append(username).append("]")
	        	   	.append("[password").append(password).append("]")
	        	   	.append("[school").append(school).append("]")
	        	   	.append("[affiliation").append(affiliation).append("]")
	        	   	.append("[currentclass").append(currentclass).append("]")
	        	   	.append("[city").append(city).append("]");
	        return builder.toString();
	    }
	
}
