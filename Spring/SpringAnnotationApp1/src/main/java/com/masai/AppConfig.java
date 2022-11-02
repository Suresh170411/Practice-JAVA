package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySource("a1.properties")
public class AppConfig {
	
	@Bean
	public List<String> getCities(){
		
		List<String> city = new ArrayList<>();
		
		city.add("Delhi");
		city.add("Goa");
		city.add("Pune");
		
		return city;
		
	}
	
}
