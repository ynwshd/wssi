/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blog.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import blog.service.IBlogService;
import blog.service.IUserService;
import core.controller.BaseController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {

    @ResponseBody
    @RequestMapping(value = "/admin")
    public ModelAndView Admin() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin");
        return modelAndView;
    }
       @ResponseBody
    @RequestMapping(value = "/index")
    public ModelAndView Index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }
}
