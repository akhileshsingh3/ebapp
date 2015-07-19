package co.elderbrother.in.service.impl;

import java.util.List;
//import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import co.elderbrother.in.dao.VerificationTokenRepository;
import co.elderbrother.in.dao.RegisterUserDao;
import co.elderbrother.in.model.RegisteredUser;
import co.elderbrother.in.model.VerificationToken;
//import co.elderbrother.in.model.VerificationToken;
import co.elderbrother.in.service.RegisterUserService;

@Service
public class RegisterUserServiceImpl implements RegisterUserService {

	@Autowired
	private RegisterUserDao registerUserDao;
	
	 
	
	@Transactional
	public void add(RegisteredUser registeredUser) {
		 registerUserDao.add(registeredUser);

	}
	
	@Transactional
	public void edit(RegisteredUser registeredUser) {
		registerUserDao.edit(registeredUser);

	}

	@Transactional
	public void delete(String email) {
		registerUserDao.delete(email);

	}

	@Transactional
	public RegisteredUser getRegisterdUser(String email) {
		return registerUserDao.getRegisterdUser(email);
	}

	@Transactional
	public List<RegisteredUser> getAllRegisterdUser() {
		return registerUserDao.getAllRegisterdUser();
	}

	
	

	
}
