package com.example.demo;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
	
		@Autowired
	    private NewRepoC newObj;

	   @GetMapping("/")
	    public List<Map<String, Object>> startTheapp()
	    {
	    	
			return newObj.getAlltable();
	    	
	    }
}
