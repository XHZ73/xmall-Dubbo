package user.augustars.xmall.xtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import user.augustars.xmall.base.controller.BaseController;
import user.augustars.xmall.xtest.service.HelloService;
@Controller("testController")
public class TestController extends BaseController {
	//要调用业务层处理事务，但业务层是远程调用的无法使用SpringBoot的原注解resource
	//只能使用Dubbo注解reference来实现Bean组件的注入,属性是version
	@Reference(version="1.0.0")
	private HelloService helloService;
	
	@RequestMapping(value="/test")
	@ResponseBody
	public String test(String name) throws Exception{
			helloService.sayHello(name);
		return name;
	}
}
