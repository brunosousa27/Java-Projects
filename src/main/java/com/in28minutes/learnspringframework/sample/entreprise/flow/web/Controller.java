package com.in28minutes.learnspringframework.sample.entreprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringframework.sample.entreprise.flow.business.BusinessService;
import com.in28minutes.learnspringframework.sample.entreprise.flow.data.DataService;

//send response in the right format
//CTRL+SHIFT+O Organize imports
@RestController
public class Controller {
	
	@Autowired //making business service available to Controller
	private BusinessService businessService;
	@Autowired
	private DataService dataService;
	
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
		
	}
	public String displayIQ() {
		return dataService.brunoIQ();
	}
	
}


