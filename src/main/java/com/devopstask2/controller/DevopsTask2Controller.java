package com.devopstask2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class DevopsTask2Controller {
	@RestController
	public class DevopsTaskController {
		@GetMapping(path = "/getMsg")
		public String getMsg() {
			return "Hello sujananthini";
		}

	}
}
