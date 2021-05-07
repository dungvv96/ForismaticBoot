package com.chatboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chatboot.model.ForismaticModel;

@RestController
@RequestMapping("/test")
public class Test {

	final String url = "https://api.forismatic.com/api/1.0/?method=getQuote&lang=en&format=json";
	
	@GetMapping
	public ForismaticModel testGetForismatic() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(url, ForismaticModel.class);
	}
}
