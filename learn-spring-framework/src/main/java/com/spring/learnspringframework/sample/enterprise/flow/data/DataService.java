package com.spring.learnspringframework.sample.enterprise.flow.data;

import java.util.List;

import org.springframework.stereotype.Component;

//getting data
@Component
public class DataService{
	public List<Integer> retrieveData(){
		return List.of(12,34,56,78,90);
	}
	
}