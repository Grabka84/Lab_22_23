package co.grandcircus.lab.Coffee_Shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.lab.Coffee_Shop.entity.Users;

@Controller
public class CoffeeController {
	
	@RequestMapping("/")
	public ModelAndView showIndex() {
		ModelAndView mav = new ModelAndView("index");
		return mav;
	}
	
	@RequestMapping("/user-reg")
		public ModelAndView showRegistration() {
		ModelAndView mav = new ModelAndView("user-reg");
		return mav;
	}
	
	@RequestMapping("/about")
		public ModelAndView showAbout() {
		ModelAndView mav = new ModelAndView("about");
		return mav; 
	}
	
	@RequestMapping("/contact")
		public ModelAndView showContact() {
		ModelAndView mav = new ModelAndView("contact");
		return mav; 
	}
	
	@RequestMapping("/user-confirm")
		public ModelAndView showConfirm(Users user) {
		ModelAndView mav = new ModelAndView("user-confirm");
		return mav; 
		}
}
