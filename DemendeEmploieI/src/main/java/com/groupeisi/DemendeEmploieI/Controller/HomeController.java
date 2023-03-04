package com.groupeisi.DemendeEmploieI.Controller;

import com.groupeisi.DemendeEmploieI.model.UserDtls;
import com.groupeisi.DemendeEmploieI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;


    @GetMapping("/")
public String index(){
    return "index";
}


    @GetMapping("/signin")
    public String login(){
        return "login";
    }
    @GetMapping("/register")
    public String register(){
        return "register";
    }
@PostMapping("/createUser")
public String createUser(@ModelAttribute UserDtls user, HttpSession session){

        //System.out.println(user);
    boolean f= userService.checkEmail(user.getEmail());
    if(f) {
        session.setAttribute("msg","Email Id alreday exist");
    }else {
    UserDtls userDtls=userService.createUser(user);
    if(userDtls!=null){
        session.setAttribute("msg","Register  Sucessfull");
    }else {
        session.setAttribute("msg","Register Not Sucessfull");

    }

    }
        return "redirect:/register";
}

}
















