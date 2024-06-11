package com.example.swagger.SwaggerExample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.swagger.SwaggerExample.dao.SportsDao;
import com.example.swagger.SwaggerExample.dto.Sports;
import com.example.swagger.SwaggerExample.repo.SportsRepo;

@RestController
@RequestMapping("/sports")
public class SportsController {
	
	@Autowired
	SportsRepo sportsrepo;
	
	@PostMapping("/savesports")
	public Sports saveSports(@RequestBody Sports sports) {
		
		return sportsrepo.save(sports);
	}
}

