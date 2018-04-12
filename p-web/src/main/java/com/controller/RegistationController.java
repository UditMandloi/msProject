package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegistationController {

	@RequestMapping(value = "/WEB-INF/jsp/registration", method = RequestMethod.GET)
	public String showRegistration(Map<String, Object> map) {
		/*
		 * RegistrationDTO registrationDTO = new RegistrationDTO();
		 * map.put("RegistrationDTO", registrationDTO);
		 */System.out.println("Registration  Controller");
		return "registration";
	}

}
