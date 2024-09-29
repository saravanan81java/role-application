package com.role.role.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.role.role.controller.model.Roles;
import com.role.role.controller.model.UserInfo;
import com.role.role.controller.service.AuthService;

@RestController
public class AdminController {

	// logger required
	
	@Autowired
	private AuthService authService;
	
	
	@GetMapping("/ping")
	public String ping() {
		return "Ping Action Success!!!!";
	}
	
	@PostMapping("/auth")
	public UserInfo validateWithRoleFeatch(String userName, String password) throws Exception {
		return authService.authValidation(userName, password);
	}
	
	@GetMapping("/allRoles")
	public List<Roles> getAllRoles(){
		return authService.getAllRoles();
		
	}
	
}
