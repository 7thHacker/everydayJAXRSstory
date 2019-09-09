package com.everydayJAXRSstory.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("welcome")
public class WelcomeNote {

	@GET
	public String welcomeUser() {
		return "welcome SHREYANSH to everydayJAXRSstory !!";
	}
}
