package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogControllerTest {
		
	@GetMapping("/test/hello")
		public String  hello() {
			return "<h1>인서야 사랑해</h1>";
		}
}
