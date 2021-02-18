package echo.webapp.coreapp.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller {

	@RequestMapping(value= "/", method= RequestMethod.GET)
	public String home() {
		System.out.println(getClass() + "- Spring boot is working!");
		return "index";
	}

	@RequestMapping(value= "/welcome", method= RequestMethod.GET)
	public ModelAndView welcome() {
		System.out.println(getClass() + "- Spring is awesome. Welcome");

		ModelAndView mav = new ModelAndView();
		mav.addObject("mymsg", "Spring is awesome!");
		mav.setViewName("welcome");
		return mav;
	}
}
