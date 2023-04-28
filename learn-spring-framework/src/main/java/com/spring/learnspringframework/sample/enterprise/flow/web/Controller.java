package com.spring.learnspringframework.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learnspringframework.sample.enterprise.flow.business.BusinessService;

//sending response in the right format
@RestController                    // allows user to type in URL and show him some data; its also upgraded @Component, so no need to add @Component
public class Controller {
	
	@Autowired
	private BusinessService businessService;
	
	@GetMapping("/sum")           //allows to define what is the URL
	public long displaySum() {
		return businessService.calculateSum();	              //to get this output, type this URL in search engine - https://localhost:8080/sum
	}
	
}


