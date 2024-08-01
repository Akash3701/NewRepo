package com.ChatBot.controller;

import java.util.Scanner;

import com.ChatBot.entity.UserInfoEntity;
import com.ChatBot.service.AdminService;
import com.ChatBot.service.AdminServiceInterface;

public class ChatBotController implements ChatBotControllerInterface {
	
	Scanner scanner = new Scanner(System.in);
	
	@Override
	public void createAccount() {
		System.out.println("Enter the name: ");
		String name = scanner.next();
		
		System.out.println("Enter the email: ");
		String email = scanner.next();
		
		System.out.println("Enter the password: ");
		String password = scanner.next();
		
		UserInfoEntity ue = new UserInfoEntity();
		ue.setName(name);
		ue.setEmail(email);
		ue.setPassword(password);
		
		AdminServiceInterface ai = new AdminService();
		int i = ai.createUserProfile(ue);
		
		if(i>0) {
			System.out.println("Created");
		}else {
			System.out.println("Failed");
		}
		
	}

	@Override
	public void editAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginAccount() {
		// TODO Auto-generated method stub
		
	}

}
