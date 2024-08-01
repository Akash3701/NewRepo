package com.ChatBot.dao;

import com.ChatBot.entity.UserInfoEntity;

public interface ChatBotDaoInterface {

	int createAccount(UserInfoEntity ue);

	UserInfoEntity viewAccount(UserInfoEntity user);

}
