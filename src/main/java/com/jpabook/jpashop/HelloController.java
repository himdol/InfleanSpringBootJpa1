package com.jpabook.jpashop;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

  @GetMapping("hello")
  public String hello(Model model) {
    model.addAttribute("data", "hello");
    return "hello";
    /**
     * 관례상 templates에 있는 html 을 찾아가게 되어있다.
     *
     * */

  }

}

