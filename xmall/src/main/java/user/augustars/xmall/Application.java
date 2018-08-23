package user.augustars.xmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
//按照顺序启动 zookeeper Tomcat 业务层   控制层，在Dubbo控制页面‘
//查看是否有请求，之后再网页查询请求，输入name