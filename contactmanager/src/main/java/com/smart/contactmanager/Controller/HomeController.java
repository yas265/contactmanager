package com.smart.contactmanager.Controller;

import com.smart.contactmanager.DAO.UserRepository;
import com.smart.contactmanager.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home")
    public String home(Model model)
    {
        model.addAttribute("title", "Home - Smart Contact Manager");
        return "Home";
    }

    @GetMapping("/about")
    public String about(Model model)
    {
        model.addAttribute("title", "About - Smart Contact Manager");
        return "About";
    }
}
