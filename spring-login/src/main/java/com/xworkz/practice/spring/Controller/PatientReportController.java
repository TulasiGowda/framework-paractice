package com.xworkz.practice.spring.Controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class PatientReportController {

	public PatientReportController() {
		System.out.println("Created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/click.do")
	public String onClick() {
		System.out.println("invoked Onclick");
		System.out.println("response send to success.jsp");
		return "/Success.jsp";
	}

	@RequestMapping(value = "/submit.do")
	public String onSubmit(@RequestParam String name, @RequestParam String address, @RequestParam String email,  @RequestParam long phoneNumber, @RequestParam String symptoms, Model model) {
		System.out.println("invoked onSubmit");
		System.out.println("name : " + name);
		System.out.println("response send to success.jsp");
		model.addAttribute("display",  name);
		return "/Success.jsp";
	}
}
