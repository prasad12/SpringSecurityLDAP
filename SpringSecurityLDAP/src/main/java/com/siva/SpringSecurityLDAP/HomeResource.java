package com.siva.SpringSecurityLDAP;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	@GetMapping("/")
	public String homePage() {
		return "<H3>WELCOME</H3>";
	}
}
