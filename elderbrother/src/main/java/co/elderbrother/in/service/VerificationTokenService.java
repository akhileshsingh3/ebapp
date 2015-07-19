package co.elderbrother.in.service;

import java.util.List;

import co.elderbrother.in.model.RegisteredUser;
import co.elderbrother.in.model.VerificationToken;

public interface VerificationTokenService {
	
	
	
	public void add(VerificationToken verificationToken);
	public void edit(VerificationToken verificationToken);
	public void delete(Long tokenId);
	VerificationToken findVerificationTokenByToken(String token);
	public VerificationToken getVerificationToken(Long tokenId);
	/* public VerificationToken getVerificationTokenByUserId(RegisteredUser user);
	 public VerificationToken getVerificationTokenByToken(String token);*/
	
	public List<VerificationToken> getAllVerificationTokens();
	
}
