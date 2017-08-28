package tw.com.rex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import tw.com.rex.model.User;

@Controller
public class BaseController {

    public BaseController() {
        System.out.println("BaseController()");
    }

    @RequestMapping("/welcome")
    public String index() {
        System.out.println("index()");
        return "/index";
    }

    @RequestMapping("/hello")
    public ModelAndView hello(User user) {
        System.out.println("hello()");
        System.out.println(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/index");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

}
