package sk.tmehut.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MySpringProjectController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String sayHello(ModelMap model) {
		model.addAttribute("message", "Hello from MySpringProject");
		
		return "welcome";
	}
	
	@RequestMapping(value="/helloAgain", method=RequestMethod.GET)
	public String sayHelloAgain(ModelMap model) {
		model.addAttribute("message", "Hello Again from MySpringProject");
		
		return "welcome";
	}

}
