package com.vmc.design.designpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vmc.design.designpatterns.factorymethod.FactoryMethodPatternService;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		
		// Factory method pattern
		new FactoryMethodPatternService();
	}

}
