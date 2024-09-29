package com.role.role.controller;


import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.role.role.controller.service.AuthService;

@WebMvcTest(AdminController.class)
@AutoConfigureMockMvc
public class AdminControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private AuthService authService;
	
	@Test
	public void getAllRolesTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/allRoles").with(csrf()))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(3)));
	} 

}
