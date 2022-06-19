package com.aurora.action;

import com.opensymphony.xwork2.ActionSupport;
import lombok.extern.slf4j.Slf4j;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

@Slf4j
@Namespace("/")
@ResultPath(value="/")
@Result(name="success", location="/WEB-INF/jsp/hello.jsp")
public class HelloAction extends ActionSupport {

    public String hello(){
        log.info("hello action...");
        return "success";
    }
}
