package com.ChatBot.view;

import java.util.Scanner;

import com.ChatBot.controller.ChatBotController;
import com.ChatBot.controller.ChatBotControllerInterface;

public class ChatBotView {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("---------Main Menu----------");
		System.out.println("Enter 1 to Create Account");
		System.out.println("Enter 2 to Edit Account");
		System.out.println("Enter 3 to Delete Account");
		System.out.println("Enter 4 to View Account");
		System.out.println("Enter 5 to View All Account");
		System.out.println("Enter 6 to Login Account");
		
		System.out.println("Enter your choice: ");
		int ch = scanner.nextInt();
		
		ChatBotControllerInterface ci = new ChatBotController();
		
		switch (ch) {
		case 1: ci.createAccount();
			break;
		case 2: ci.editAccount();
			break;
		case 3:	ci.deleteAccount();
			break;
		case 4: ci.viewAccount();
			break;
		case 5: ci.viewAllAccount();
			break;
		case 6: ci.loginAccount();
			break;
		default: System.out.println("Error");
			break;
		}
		
		scanner.close();
		//chandramohan4854
	}
}
