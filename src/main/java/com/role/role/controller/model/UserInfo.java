package com.role.role.controller.model;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo implements Serializable{
	private static final long serialVersionUID = 1L;
	private String userName;
	private List<Roles> userRoles;
}
