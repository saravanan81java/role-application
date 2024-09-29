package com.role.role.controller.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.role.role.controller.model.UserInfo;
import com.role.role.controller.model.Roles;

@Service
public class AuthServiceImpl implements AuthService{

	@Override
	public UserInfo authValidation(String userName, String password) throws Exception {
		return loginWithRole(userName, password);
	}

	private UserInfo loginWithRole(String userName, String password) throws Exception {
		UserInfo user  = null;
		if(userName.equals("Admin") && password.equals("Admin")) {
			List<Roles> roles = Arrays.asList(new Roles(1, "Admin"),new Roles(2, "Dev"));
			user = new UserInfo(userName, roles);
		}else {
			throw new Exception("User not valid !!!");
		}
		return user;
	}

	@Override
	public List<Roles> getAllRoles() {
		List<Roles> roles = Arrays.asList(new Roles(1, "Admin"),new Roles(2, "Dev"), new Roles(3, "Test"));
		return roles;
	}

}
