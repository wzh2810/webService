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
		userList.add(new User(1, 18, "小明"));
		userList.add(new User(2, 19, "小牛"));
		userList.add(new User(3, 17, "小羊"));
		
		System.out.println("getUsers()");
		return userList;
	}

	

}
