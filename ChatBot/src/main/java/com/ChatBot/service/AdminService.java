package com.ChatBot.service;

import com.ChatBot.dao.ChatBotDao;
import com.ChatBot.dao.ChatBotDaoInterface;
import com.ChatBot.entity.UserInfoEntity;

public class AdminService implements AdminServiceInterface {

	@Override
	public int createUserProfile(UserInfoEntity ue) {
		ChatBotDaoInterface ci = new ChatBotDao();
		int i = ci.createAccount(ue);
		return i;
	}

}
