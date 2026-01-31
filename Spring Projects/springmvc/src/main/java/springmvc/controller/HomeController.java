package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/model")
	public String modelConcept(Model model) {
		System.out.println("Home Controller Model Concept Invoked");
		model.addAttribute("name", "Kohli");
		model.addAttribute("iplteam", "RCB");
		
		List<String> players = new ArrayList<>();
		players.add("Rohit");
		players.add("Abishek Sharma");
		players.add("Kohli");
		model.addAttribute("players", players);

		return "model";
	}
	
	@RequestMapping("/modelandview")
	public ModelAndView modelConcept() {
		System.out.println("Home Controller Model and View Concept Invoked");
		ModelAndView modelview = new ModelAndView();
		modelview.addObject("name", "Kohli");
		modelview.addObject("iplteam", "RCB");
		modelview.setViewName("modelandview");
		return modelview;
	}

}
