package demo.Project.Project.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Value("${s}")
	private String message;
	
	@GetMapping("/say")
	public String sayHello() {
		return message;
	}
}
