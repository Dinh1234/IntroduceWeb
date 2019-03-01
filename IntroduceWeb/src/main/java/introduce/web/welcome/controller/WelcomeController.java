package introduce.web.welcome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/")
	public ModelAndView homeController() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:welcome");

		return mav;
	}

	@RequestMapping(value = "/welcome")
	public ModelAndView welcomeController() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("welcome");

		return mav;
	}
}
