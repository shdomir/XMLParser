package com.spring.wex.controller;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "xmlP")
public class XMLParserController extends RouteBuilder {

	@GetMapping
	public void configure() throws Exception {
		from("file:C:/Users/shubham.domir/Downloads/source").to("file:C:/Users/shubham.domir/Downloads/Destination");
	}

}
