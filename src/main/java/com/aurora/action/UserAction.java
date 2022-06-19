package com.aurora.action;

import com.aurora.entity.UserEntity;
import com.aurora.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.extern.slf4j.Slf4j;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
public class UserAction extends ActionSupport {

    @Autowired
    UserService userService;

    @RequestMapping("/toWelcome")
    public String toWelcome(){
        log.info("toWelcome...");
        return "welcome";
    }

    @RequestMapping("/getUsers")
    public String getUsers(){
        HttpServletRequest req = ServletActionContext.getRequest();
        //HttpServletResponse resp = ServletActionContext.getResponse();
        log.info("getUsers...");
        //List<UserEntity> list = userService.getUsers();

        //模拟db数据
        List<UserEntity> list = Arrays.asList(
              new UserEntity().setId(1001).setName("张瑶").setAge(18).setSex("女").setPhone("1234567890"),
              new UserEntity().setId(1002).setName("李灿").setAge(19).setSex("男").setPhone("1234567891"),
              new UserEntity().setId(1003).setName("陈真").setAge(20).setSex("男").setPhone("1234567892")
        );
        req.setAttribute("data", list);
        return "user";
    }

    @RequestMapping("/addUser")
    public String addUser(){
        log.info("addUser...");
        int num = 0;
        try {
            num = userService.addUser(new UserEntity().setName("lisa").setAge(18));
        } catch (Exception e) {
            log.error("add User has Error: {}", e.getMessage());
        }
        return num > 0 ? "ok" : "error";
    }


}
