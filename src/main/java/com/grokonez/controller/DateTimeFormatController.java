package com.grokonez.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DateTimeFormatController {

	
	@GetMapping("/v1")
	public String showDateTimeFormat(
			@RequestParam("date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date date,
			@RequestParam("localdate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate,
			@RequestParam("localdatetime") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime localDateTime
			) {
		System.out.println("date: "+ date);
		System.out.println("localdate: "+ localDate);
		System.out.println("localdatetime: "+ localDateTime);
		return "V1 done";
	}
	
	@GetMapping("/v2")
	public String showDateTimeFormat2(
			@RequestParam("date") @DateTimeFormat(pattern = "yyyy.MM.dd") Date date,
			@RequestParam("localDate") @DateTimeFormat(pattern = "yyyy.MM.dd") LocalDate localDate,
			@RequestParam("localDateTime") @DateTimeFormat(pattern = "yyyy.MM.dd HH:mm:ss") LocalDateTime localDateTime
			) {
		return "" + date + " , "+ localDate + " , "+ localDateTime;
	}
}
