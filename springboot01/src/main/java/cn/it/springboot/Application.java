package cn.it.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author Linger
 *
 */
@SpringBootApplication // 代表为SpringBoot应用的运行主类
public class Application {
	
	public static void main(String[] args) {
		/** 运行springboot应用 */
		// SpringApplication.run(Application.class, args);
		// 创建SpringApplication对象
		SpringApplication springApplication = new SpringApplication(Application.class);
		// 去广告
		springApplication.setBannerMode(Banner.Mode.OFF);
		// 运行
		springApplication.run(args);
	}
}
