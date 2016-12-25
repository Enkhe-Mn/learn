package org.ek.spring_web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {

//	@RequestMapping(value = "view", method = RequestMethod.GET)
//	public String helloWorld(Country model) {
//		// model.addAttribute("message", "Hello World!");
//		System.out.println("hello world");
//		return "helloWorld";
//	}

	@RequestMapping(value = "view")
	public String helloWorld() {
		// model.addAttribute("message", "Hello World!");
		System.out.println("hello world");
		return "helloWorld";
	}
}

class Country {

}