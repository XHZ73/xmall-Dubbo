package user.augustars.xmall.xtest.service.impl;

import org.springframework.stereotype.Service;
import user.augustars.xmall.xtest.service.HelloService;
//Spring boot框架是全注解模式的，没有配置文件，所以需要把业务层变为Bean组件
//同时因为Dubbo存在，需要添加Dubbo的注解，并明确版本
@Service("helloService")
@com.alibaba.dubbo.config.annotation.Service(version="1.0.0")
public class HelloServiceImpl implements HelloService {

	public void sayHello(String name) throws Exception {
		System.out.println("你好" + name);
	}

}
