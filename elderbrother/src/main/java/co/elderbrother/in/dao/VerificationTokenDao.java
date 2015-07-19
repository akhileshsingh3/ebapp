package co.elderbrother.in.dao;
import java.util.List;

import co.elderbrother.in.model.RegisteredUser;
import co.elderbrother.in.model.VerificationToken;
public interface VerificationTokenDao  {

	public void add(VerificationToken verificationToken);
	public void edit(VerificationToken verificationToken);
	public void delete(Long tokenid);
	public VerificationToken getVerificationToken(Long tokenId);
	VerificationToken findVerificationTokenByToken(String token);
	
	/* public VerificationToken getVerificationTokenByUserId(RegisteredUser user);
	 public VerificationToken getVerificationTokenByToken(String token);*/
	
	public List<VerificationToken> getAllVerificationTokens();
	
	
    
}