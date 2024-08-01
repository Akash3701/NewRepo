package com.ChatBot.dao;

import com.ChatBot.entity.UserInfoEntity;

public class ChatBotDao implements ChatBotDaoInterface {
	
	private static UserInfoEntity user[];
	static {
		user= new UserInfoEntity[10];
	}
	
	@Override
	public int createAccount(UserInfoEntity ue) {
		for(int i=0; i<user.length; i++) {
			if(user[i]==null) {
				user[i]=ue;
				break;
			}
		}
		if(user.length>0) {
			return 1;
		}else {
			return 0;
		}
	}

}
