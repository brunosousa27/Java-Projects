package com.in28minutes.learnspringframework.sample.entreprise.flow.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

//Data from database
@Component
public class DataService {
	public List<Integer> retrieveData(){
		return Arrays.asList(12,34,56,78,90);
	}
	
	public String brunoIQ() {
		return "Bruno, your IQ score is:";
	}
}
