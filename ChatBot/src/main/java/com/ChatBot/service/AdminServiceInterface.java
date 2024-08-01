package com.ChatBot.service;

import com.ChatBot.entity.UserInfoEntity;

public interface AdminServiceInterface {

	int createAccount(UserInfoEntity ue);

	UserInfoEntity viewAccount(UserInfoEntity user);

}
