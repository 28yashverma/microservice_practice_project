package com.starter.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
@RefreshScope
public class StarterController {

	@Value("${my-name}")
	private String h;

	@GetMapping("/getHello")
	public String getHello() {
		return "hello from starter service : " + h;
	}

}
