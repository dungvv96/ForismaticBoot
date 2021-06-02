package com.chatboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chatboot.model.ForismaticModel;

@RestController
@RequestMapping("/test")
public class Test {

	private static final Logger logger = LoggerFactory.getLogger(Test.class);
	
	final String url = "https://api.forismatic.com/api/1.0/?method=getQuote&lang=en&format=json";
	
	@GetMapping
	public ForismaticModel testGetForismatic() {
		logger.info("Call api test");
		RestTemplate restTemplate = new RestTemplate();
		ForismaticModel model = restTemplate.getForObject(url, ForismaticModel.class);
		logger.info("after call forismatic");
		return model;
	}
}
