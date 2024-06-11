package com.demo.Books.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.Books.dao.BookDao;
import com.demo.Books.model.Books;

@RestController
@RequestMapping("books")
public class BookController {

	@Autowired
	BookDao dao;
	
	@PostMapping("save")
	public Books saveBook(@RequestBody Books book) {
		
		return dao.saveBook(book);
	}
	
	@QueryMapping
	public List<Books> getAll(){
		
		return dao.getAll();
	}
	
}
