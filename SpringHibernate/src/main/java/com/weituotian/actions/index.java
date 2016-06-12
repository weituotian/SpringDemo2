package com.weituotian.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.weituotian.model.ClazzEntity;
import com.weituotian.services.ClazzService;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;


/**
 * Created by ange on 2016/6/6.
 */

@Controller
@Action("login")
@Namespace("/")
@Results({@Result(name = "success", location = "/index.jsp"), @Result(name = "error", location = "/error.jsp")})
public class index extends ActionSupport {

    private int id;
    private String name;

    @Resource
    ClazzService clazzService;

    private ClazzEntity ce;

    @Override
    public String execute() throws Exception {
        Integer id = 1;
        ce = clazzService.findById(id);
        return "success";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClazzService getClazzService() {
        return clazzService;
    }

    public void setClazzService(ClazzService clazzService) {
        this.clazzService = clazzService;
    }

    public ClazzEntity getCe() {
        return ce;
    }

    public void setCe(ClazzEntity ce) {
        this.ce = ce;
    }


}

