package blog.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import blog.service.IBlogService;
import blog.service.IUserService;

import core.controller.BaseController;

/**
 *
 * 
 * @Description:
 */
@Controller
@RequestMapping("/hello")
public class HelloController extends BaseController {
	@Autowired
	private IBlogService blogService;
	@Autowired
	private IUserService userService;

	/**
	 * 写博客
	 * 
	 * @param blog
	 * @param request
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/show")
	public String Show() {
		return "hello";
	}

}
