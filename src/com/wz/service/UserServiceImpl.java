package com.wz.service;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.wz.iservice.IUserService;
import com.wz.model.User;

@WebService
public class UserServiceImpl implements IUserService{

	List<User> userList = new ArrayList<User>();
		
	@Override
	public List<User> getUsers() {
		userList.add(new User(1, 18, "С��"));
		userList.add(new User(2, 19, "Сţ"));
		userList.add(new User(3, 17, "С��"));
		
		System.out.println("getUsers()");
		return userList;
	}

	

}
