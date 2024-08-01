package com.ChatBot.controller;

import java.util.Scanner;

import com.ChatBot.Exception.UserNotFoundException;
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
		int i = ai.createAccount(ue);
		
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
		System.out.println("Enter email to view profile: ");
		String email = scanner.next();
		
		UserInfoEntity user = new UserInfoEntity();
		user.setEmail(email);
		
		AdminServiceInterface al = new AdminService();
		UserInfoEntity us = al.viewAccount(user);
		
		try {
			if(us != null) {
				System.out.println(us.getName());
				System.out.println(us.getEmail());
				System.out.println(us.getPassword());
			}else {
				throw new UserNotFoundException("Profile not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void viewAllAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void searchAccount() {
		// TODO Auto-generated method stub
		
	}

}
