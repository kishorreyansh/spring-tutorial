package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home Controller Home Invoked");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("Home Controller About Invoked");
		return "about";
	}

}
