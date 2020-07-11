package com.gzhc365.mid.demo.controller;

import com.gzhc365.mid.demo.entity.User;
import com.gzhc365.mid.demo.facade.UserFacade;
import com.gzhc365.mid.demo.vo.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Auther: zhang_yx
 * @Date: 2020/7/11 20:29
 */
@RestController
@RequestMapping("/api/mid/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    private UserFacade userFacade;

    @RequestMapping("/getbyid")
    public User wxocr(HttpServletRequest request, HttpServletResponse response, UserVo userVo) throws Exception {
        return userFacade.getUser(userVo);
    }
}
