package com.BikkadIT.ControllerToUI.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/WelMsg")
	public ModelAndView welcomeMsg() {
		String msg= "Welcome to BikkadIT";
		ModelAndView mav = new ModelAndView();
		mav.addObject("MESSAGE",msg);
		mav.setViewName("wel");
		return mav;
		
	}

}
