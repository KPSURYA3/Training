package com.example.swagger.SwaggerExample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.swagger.SwaggerExample.dto.Sports;

public interface SportsRepo extends  JpaRepository<Sports, String> {

}
