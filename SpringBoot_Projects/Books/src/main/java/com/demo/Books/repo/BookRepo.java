package com.demo.Books.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Books.model.Books;

public interface BookRepo extends JpaRepository<Books, Integer> {

}
