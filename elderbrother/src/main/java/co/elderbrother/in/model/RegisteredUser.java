package co.elderbrother.in.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class RegisteredUser {
	@Id
	@Column
	
	private String username;
	@Column
	
	private String firstname;
	@Column
	
	private String lastname;
	@Column
	
	private String password;
	@Column
	
	private String school;
	@Column
	
	private String affiliation;
	@Column
	private String specialization;
	@Column
	
	private String city;
	@Column
	private String confirmed;
	@Column
	private String loggedin;
	@Column
	
	private String currentclass;
	@Column
	private String userType;

	public RegisteredUser() {
		
	}
	public RegisteredUser(	String firstname,		String lastname,	String username,	String password,
							String currentclass,	String school,		String affiliation,	String city,
							String specialization,	String confirmed,	String loggedin, 	String userType) {
		super();
		this.username = username;	this.firstname = firstname;	this.lastname = lastname;	this.password = password;
		this.school = school;	this.affiliation = affiliation;	this.specialization = specialization;this.city = city;
		this.confirmed = confirmed;	this.loggedin = loggedin;	this.currentclass = currentclass; this.userType = userType;	
	}
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
	
	
}
