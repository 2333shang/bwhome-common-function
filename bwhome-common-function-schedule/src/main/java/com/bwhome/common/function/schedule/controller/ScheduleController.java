package com.bwhome.common.function.schedule.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
public class ScheduleController {

	@GetMapping("invoke")
	public String invoke() {
		System.out.println("hello");
		return LocalTime.now() + " invoke";
	}

}
