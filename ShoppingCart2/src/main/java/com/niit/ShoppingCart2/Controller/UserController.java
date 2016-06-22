package com.niit.ShoppingCart2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ShoppingCart2.dao.UserDAO;







@Controller
public class UserController {

   @Autowired
	UserDAO userDAO;


	@RequestMapping("/isValidUser")
	public ModelAndView showMessage(@RequestParam(value = "name") String name,
			@RequestParam(value = "password") String password) {
		System.out.println("in controller");

		String message;
		ModelAndView mv ;
		if (userDAO.isValidUser(name, password)) 
		{
			message = "Valid credentials";
			 mv = new ModelAndView("adminHome");
		} else {
			message = "Invalid credentials";
			 mv = new ModelAndView("Login");
		}

		//ModelAndView mv = new ModelAndView("success");
		mv.addObject("message", message);
		mv.addObject("name", name);
		// mv.addObject("password", password);
		return mv;
	}

}
