package co.elderbrother.in.service;

import java.util.List;

import co.elderbrother.in.model.RegisteredUser;


public interface RegisterUserService {
	public void add(RegisteredUser registeredUser);
	public void edit(RegisteredUser registeredUser);
	public void delete(String email);
	public RegisteredUser getRegisterdUser(String email);
	public List<RegisteredUser> getAllRegisterdUser();
	
	

    

}
