package user.augustars.xmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Application {
	public static void main(String[] args) {
		//这里作为启动文件，意在与启动Spring Boot
		SpringApplication.run(Application.class, args);
	}
}
