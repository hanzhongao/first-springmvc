package com.hza.springmvc.controller;

import com.hza.springmvc.entity.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

/**
 * Create by hza
 * 2019-11-14 12:15
 */
@Controller
@RequestMapping("/map")
public class UrlMappingController {

    @GetMapping("/g")
    @ResponseBody
    public String getMapping(@RequestParam("admin_name") String adminName,
                             @DateTimeFormat(pattern = "yyyy-MM") Date createTime) {
        System.out.println("adminName:" + adminName);
        System.out.println(createTime);
        return "This is a get method" ;
    }

    @PostMapping("/p")
//    @RequestMapping(value = "/p", method = RequestMethod.POST) // 作用同上
    @ResponseBody
    public String postMapping(String username, Long password) {
        System.out.println(username + ":" + password);
//        return "This is a post method" ;
        return "This is a post method" ;
    }

    @PostMapping("/p1")
//    @RequestMapping(value = "/p", method = RequestMethod.POST) // 作用同上
    @ResponseBody
    public String postMapping1(String username, User user, @DateTimeFormat(pattern = "yyyy-MM-dd") Date createTime) {
        System.out.println("username:" + username);
        System.out.println(user.toString());
        System.out.println(createTime);
        return "这是 post 请求" ;
    }

    @GetMapping("/view")
    public ModelAndView view(Integer userId) {

        ModelAndView mav = new ModelAndView("view") ;
        User user = new User() ;
        if (userId == 1) {
            user.setUsername("张三");
        } else if(userId == 2) {
            user.setUsername("lisi");
        } else if (userId == 3) {
            user.setUsername("刘能");
        }

        mav.addObject("user", user) ;

        return mav ;
    }

    @GetMapping("/view1")
    public String view1(Map<String,Object> map, Integer userId) {

        User user = new User() ;

        if (userId == 1) {
            user.setUsername("张三");
        } else if(userId == 2) {
            user.setUsername("lisi");
        } else if (userId == 3) {
            user.setUsername("迈克尔·刘能");
        }

        map.put("user", user) ;

        return "view" ;
    }

}
