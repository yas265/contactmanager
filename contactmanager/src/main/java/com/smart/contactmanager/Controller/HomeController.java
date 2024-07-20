package com.smart.contactmanager.Controller;

import com.smart.contactmanager.DAO.UserRepository;
import com.smart.contactmanager.Entity.User;
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
        User user = new User();
        user.setName("Yashant");
        user.setEmail("yashant2@gmail.com");
        userRepository.save(user);

        return "Working";
    }
}
