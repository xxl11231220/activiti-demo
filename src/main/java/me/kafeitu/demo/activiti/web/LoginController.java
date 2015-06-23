package me.kafeitu.demo.activiti.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 登录页面
 *
 * @author HenryYan
 */
@Controller
public class LoginController {
	@Autowired
	HttpServletRequest request;
    @RequestMapping(value = "/login")
    public String login() {
    	System.out.println(request.getContextPath());
        return "login";
    }

}
