package com.transpose;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class MainController {
    
    @RequestMapping(value = "/")
    public String home(Model model) {
//        User user = new User();
//        model.addAttribute("user", user);
//        return "login";
    	return "index";
    }
    
    @RequestMapping(value = "/handleLogin", method = RequestMethod.POST)
    public String handleLogin(@ModelAttribute("user") User user, Model model) {
        String message = "";
        if (user.getPassword().equals("letmein")) {
            message = "Welcome " + user.getLogin() + " !";
        } else {
            message = "You are unauthorized to access!";
        }
        model.addAttribute("message", message);
        return "result";
    }
    
    @RequestMapping(value = "/about")
    public String about(Model model) {
//        User user = new User();
//        model.addAttribute("user", user);
//        return "login";
    	return "about";
    }
}
