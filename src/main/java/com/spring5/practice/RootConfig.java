package com.spring5.practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.spring5.practice.config.persistence.HibernateConfig;

@ComponentScan(basePackages = { "com.spring5.practice.service", "com.spring5.practice.config.persistence",
		"com.spring5.practice.config.security"})
//@ComponentScan(basePackageClasses = {StudentService.class})
public class RootConfig {
	@Bean
	GlobalExceptionHandler globalExceptionHandler() {
		return new GlobalExceptionHandler();
	}

	@Bean
	HibernateConfig hibernateConfig() {
		return new HibernateConfig();
	}
}
