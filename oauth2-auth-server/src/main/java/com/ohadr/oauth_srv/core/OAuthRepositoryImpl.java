package com.ohadr.oauth_srv.core;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ohadr.oauth_srv.types.OAuthUser;

//@Repository
@Component
public class OAuthRepositoryImpl extends AbstractOAuthRepository 
{

	@Override
	public void createAccount(String email, String encodedPassword,
			String secretQuestion, String encodedAnswer) {
		// TODO Auto-generated method stub

	}

	@Override
	public OAuthUser getUser(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOAuthAccount(String email) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean changePassword(String username, String newEncodedPassword) {
		// TODO Auto-generated method stub
		return false;
	}

}