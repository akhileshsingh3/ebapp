package co.elderbrother.in.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.elderbrother.in.dao.VerificationTokenDao;
import co.elderbrother.in.model.RegisteredUser;
import co.elderbrother.in.model.VerificationToken;
@Repository
public class VerificationTokenDaoImpl implements VerificationTokenDao {

	@Autowired
	private SessionFactory session;
	
	@Override
	public void add(VerificationToken verificationToken) {
		session.getCurrentSession().save(verificationToken);

	}

	@Override
	public void edit(VerificationToken verificationToken) {
		session.getCurrentSession().update(verificationToken);

	}

	@Override
	public void delete(Long tokenid) {
		session.getCurrentSession().delete(getVerificationToken(tokenid));

	}

	

	@Override
	public List<VerificationToken> getAllVerificationTokens() {
		return session.getCurrentSession().createQuery("from VerificationToken").list();
	}

	@Override
	public VerificationToken findVerificationTokenByToken(String token) {
		Criteria criteria = session.getCurrentSession().createCriteria(VerificationToken.class);
		criteria.add(Restrictions.eq("token", token));		
		return (VerificationToken) criteria.uniqueResult();
	}

	@Override
	public VerificationToken getVerificationToken(Long tokenId) {
		return (VerificationToken)session.getCurrentSession().get(VerificationToken.class, tokenId);
	}

	

	

	

	

}
