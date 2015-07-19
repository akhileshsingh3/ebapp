package co.elderbrother.in.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.elderbrother.in.dao.RegisterUserDao;
import co.elderbrother.in.model.RegisteredUser;

@Repository
public class RegisterUserDaoImpl implements RegisterUserDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(RegisteredUser registeredUser) {
		 session.getCurrentSession().save(registeredUser);

	}

	@Override
	public void edit(RegisteredUser registeredUser) {
		session.getCurrentSession().update(registeredUser);

	}

	@Override
	public void delete(String email) {
		session.getCurrentSession().delete(getRegisterdUser(email));
		//delete user credentials

	}

	@Override
	public RegisteredUser getRegisterdUser(String email) {
		return (RegisteredUser)session.getCurrentSession().get(RegisteredUser.class, email);
	}

	@Override
	public List<RegisteredUser> getAllRegisterdUser() {
		return session.getCurrentSession().createQuery("from RegisteredUser").list();
	}

}
