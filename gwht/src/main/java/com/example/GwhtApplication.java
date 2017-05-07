package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;


@SpringBootApplication
@EnableScheduling
@EnableRedisHttpSession
//implements EmbeddedServletContainerCustomizer  实现该端口的customize方法可以设置启动端口
public class GwhtApplication {

	public static void main(String[] args) {
		SpringApplication.run(GwhtApplication.class, args);
	}

//	@Override
//	public void customize(ConfigurableEmbeddedServletContainer container) {
//		container.setPort(8081);
//	}
}
