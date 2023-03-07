package com.javatech.productservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productController {

	@RequestMapping(method = RequestMethod.GET, value = "/checkService")
	public String checkService() {
		return "Service is running..";
	}

}
