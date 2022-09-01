package com.employee.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {

		@ResponseBody
		@RequestMapping("/")
		public String doget() {
			return"Hi User";
		}
		
		
		@ResponseBody
		@RequestMapping("/user")
		public String getSuer() {
			return"My Name is Afzal ";
		}
	
}
