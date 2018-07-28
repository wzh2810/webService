package com.wz.iservice;

import java.util.List;

import javax.jws.WebService;

import com.wz.model.User;

@WebService
public interface IUserService {
	
	public List<User> getUsers();
	
	
	
	

}
