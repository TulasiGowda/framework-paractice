package com.xworkz.practice.spring.Controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class LoginController {

	public LoginController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public String onLogin(@RequestParam String username, @RequestParam String password, Model model) {
		System.out.println("Invoked onLogin()");
		if ("xworkz".equals(username) && "secret".equals(password)) {
			System.out.println("UserName and Password are matching, so navigate to LoginPage ");
			model.addAttribute("username", username);
			return "/LoginSuccess.jsp";
		}

		System.out.println("Username : " + username + "and Password : " + password);
		System.out.println("UserName and Password are not matching, so it is in LoginPage");
		return "/Failure.jsp";
	
	}
}
