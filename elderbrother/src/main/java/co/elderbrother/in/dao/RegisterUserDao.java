package co.elderbrother.in.dao;

import java.util.List;
import co.elderbrother.in.model.RegisteredUser;

public interface RegisterUserDao {
	public void add(RegisteredUser registeringUser);
	public void edit(RegisteredUser registeringUser);
	public void delete(String email);
	public RegisteredUser getRegisterdUser(String email);
	public List<RegisteredUser> getAllRegisterdUser();

}
