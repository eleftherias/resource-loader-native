package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = resourceLoader.getResource("https://simplesaml-for-spring-saml.apps.pcfone.io/saml2/idp/metadata.php");
		System.out.println("Expected resource class: class org.springframework.core.io.UrlResource \n" +
				"Actual resource class: " + resource.getClass());
		SpringApplication.run(DemoApplication.class, args);
	}

}
