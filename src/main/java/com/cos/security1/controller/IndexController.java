package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cos.security1.model.User;

@Controller
public class IndexController {

  @GetMapping("/login")
  public String login() {
    return "loginForm";
  }

  @GetMapping("/join")
  public String join() {
    return "joinForm";
  }

  @PostMapping("/join")
  public String join(User user) {
    System.out.println(user.toString());
    return "redirect:/login";
  }

}
