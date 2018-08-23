package user.augustars.xmall.base.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller("baseController")
public class BaseController {
	//添加注解，让属性自动注入
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	protected HttpSession session;
}
