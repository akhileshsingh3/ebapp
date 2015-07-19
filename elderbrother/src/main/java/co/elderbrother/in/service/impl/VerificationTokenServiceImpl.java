package co.elderbrother.in.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.elderbrother.in.model.RegisteredUser;
import co.elderbrother.in.model.VerificationToken;
import co.elderbrother.in.service.VerificationTokenService;
import co.elderbrother.in.dao.VerificationTokenDao;


@Service
@Transactional
public class VerificationTokenServiceImpl implements VerificationTokenService {

	@Autowired
    private VerificationTokenDao tokenRepositoryDao;

	

	@Override
	public void add(VerificationToken verificationToken) {
		tokenRepositoryDao.add(verificationToken);
		
	}

	@Override
	public void edit(VerificationToken verificationToken) {
		tokenRepositoryDao.edit(verificationToken);
		
	}

	@Override
	public void delete(Long tokenId) {
		tokenRepositoryDao.delete(tokenId);
		
	}

	@Override
	public VerificationToken findVerificationTokenByToken(String token) {
		
		return tokenRepositoryDao.findVerificationTokenByToken(token);
	}

	@Override
	public List<VerificationToken> getAllVerificationTokens() {
		
		return tokenRepositoryDao.getAllVerificationTokens();
	}

	@Override
	public VerificationToken getVerificationToken(Long tokenId) {
		
		return  tokenRepositoryDao.getVerificationToken(tokenId);
	}

	
	
	

}
