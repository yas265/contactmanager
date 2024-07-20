package com.smart.contactmanager.Controller;

import com.smart.contactmanager.DAO.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home")
    @ResponseBody
    public String home()
    {

        return "Working";
    }
}
