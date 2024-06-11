package com.demo.Books.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.Books.model.Books;
import com.demo.Books.repo.BookRepo;

@Repository
public class BookDao {

	@Autowired
	BookRepo repo;
	
	public Books saveBook(Books book) {
		
		return repo.save(book);
	}
	
	public List<Books> getAll(){
		
		List<Books> l = repo.findAll();
		return l;
	}
}