package co.grandcircus.lab.Coffee_Shop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.lab.Coffee_Shop.dao.ItemsDao;
import co.grandcircus.lab.Coffee_Shop.entity.Items;
import co.grandcircus.lab.Coffee_Shop.entity.Users;

@Controller
public class CoffeeController {
	
	@Autowired
	private ItemsDao itemsDao;
	
	@RequestMapping("/")
	public ModelAndView showIndex() {
		List<Items> itemList = itemsDao.findAll();
		return new ModelAndView("index", "items", itemList);
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
