/**
 * @(#)MainController.java, 2015年5月27日. Copyright 2015 Yodao, Inc. All rights
 *                          reserved. YODAO PROPRIETARY/CONFIDENTIAL. Use is
 *                          subject to license terms.
 */
package com.simple.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author qihong
 */
@Controller
public class MainController {
    public ModelAndView handleRequest(HttpServletRequest req,
            HttpServletResponse resp) throws Exception {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World!");
        mv.setViewName("index");
        return mv;
    }

}
