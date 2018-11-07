package com.hk.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hk.bean.User;
import com.hk.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/register.do")
	public String register(User user) {
        String name=user.getName();
        String pwd=user.getPassword();
        // 如果数据库中没有该用户，可以注册，否则跳转页面
        if (userService.login(name, pwd) == null) {
            // 添加用户
            userService.regist(user);
            // 注册成功跳转到主页面
            return "login";
        }else {
            // 注册失败跳转到错误页面
            return "index";
        }        
    }	
	@RequestMapping("/login.do")
	public ModelAndView login(String name,String password,ModelAndView mv,HttpSession session) {
        User user=userService.login(name, password);
        if(user!=null){
            session.setAttribute("user", user);
            mv.setViewName("main");
        }else {  
            mv.addObject("message","登录名和密码错误，请重新输入");
            mv.setViewName("login");
        }
        return mv;
  	}
}
