package com.xidian.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Controller
public class JumpToMall {

    @RequestMapping("/toJump")
    public void testRed(HttpServletResponse response) throws Exception{
        response.sendRedirect("http://3165i18929.picp.vip/mall");
    }
}
