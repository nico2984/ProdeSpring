package com.prode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.prode.model.Cliente;
import com.prode.service.ClienteService;


@Controller
public class LoginController {
	
	@Autowired
	private ClienteService clienteService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(){
		
		
		return "login";
	}
}
