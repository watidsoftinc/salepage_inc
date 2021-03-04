package com.softinc.WebForAll.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softinc.WebForAll.dto.Hellodto;

@RestController
@RequestMapping("/api")
public class HelloController {

	@GetMapping("/hello")
	public Hellodto hello() {
		Hellodto hellodto = new Hellodto();
		hellodto.setMessage("yo yo");
		
		return hellodto;
	}
}
