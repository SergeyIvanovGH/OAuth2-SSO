package com.luxoft.aouth2ssoserver.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class UserController {

	@RequestMapping("/user/me")
	public Principal user(Principal principal) {
		return principal;
	}
}
