package com.lzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EnjoyGitApplication extends SpringBootServletInitializer {


	public static void main(String[] args) throws Exception {
		SpringApplication.run(EnjoyGitApplication.class,args);
	}
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(EnjoyGitApplication.class);
	}


}
