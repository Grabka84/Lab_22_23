package co.grandcircus.lab.Coffee_Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.lab.Coffee_Shop.dao.ItemsDao;
import co.grandcircus.lab.Coffee_Shop.dao.UsersDao;
import co.grandcircus.lab.Coffee_Shop.entity.Users;

@Controller
public class CoffeeController {
	
	@Autowired
	private ItemsDao itemsDao;
	
	@Autowired
	private UsersDao usersDao;
	
	@RequestMapping("/")
	public ModelAndView showIndex() {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("items", itemsDao.findAll());
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
	
	@PostMapping("/user-confirm")
		public ModelAndView showConfirm(Users user) {
		usersDao.create(user);
		ModelAndView mav = new ModelAndView("user-confirm", "users", user);
		return mav; 
		}
}
