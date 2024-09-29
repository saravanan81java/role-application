package com.role.role.controller.service;

import java.util.List;

import com.role.role.controller.model.Roles;
import com.role.role.controller.model.UserInfo;

public interface AuthService {
	
	//login validation with associate roles
	UserInfo authValidation(String userName, String password) throws Exception;

	List<Roles> getAllRoles(); 
}
