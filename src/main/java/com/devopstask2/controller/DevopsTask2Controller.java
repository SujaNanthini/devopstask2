package com.devopstask2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DevopsTask2Controller {
	@GetMapping(path = "/getMsg")
	public String getMsg() {
		return "Hello sujananthini";
	}

}
