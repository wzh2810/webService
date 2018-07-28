package com.wz;

import javax.xml.ws.Endpoint;

import com.wz.service.UserServiceImpl;

public class Bootstrap {

	public static void main(String[] args) {

        Endpoint.publish("http://localhost:8888/wz/user",new UserServiceImpl());

        System.out.println("publish success");
    }
}
