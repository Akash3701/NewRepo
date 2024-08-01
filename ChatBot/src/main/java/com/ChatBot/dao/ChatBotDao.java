package com.ChatBot.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ChatBot.entity.UserInfoEntity;

public class ChatBotDao implements ChatBotDaoInterface {
	int i = 0;
	UserInfoEntity u = null;

	@Override
	public int createAccount(UserInfoEntity ue) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase", "root", "MySql@123@");

			PreparedStatement ps = con.prepareStatement("INSERT INTO UserInfoEntity (name, email, password) VALUES (?, ?, ?)");
			ps.setString(1, ue.getName());
			ps.setString(2, ue.getEmail());
			ps.setString(3, ue.getPassword());

			i = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return i;
	}

	@Override
	public UserInfoEntity viewAccount(UserInfoEntity user) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbase", "root", "MySql@123@");
			
			PreparedStatement ps = con.prepareStatement("select * from UserInfoEntity where email=?");
			ps.setString(1, user.getEmail());
			
			ResultSet resultset = ps.executeQuery();
			
			if(resultset.next()) {
				String a = resultset.getString(1);
				String b = resultset.getString(2);
				String c = resultset.getString(3);
				
				u = new UserInfoEntity();
				u.setName(a);
				u.setEmail(b);
				u.setPassword(c);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}
}
