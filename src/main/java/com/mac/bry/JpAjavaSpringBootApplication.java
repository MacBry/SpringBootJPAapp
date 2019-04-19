package com.mac.bry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mac.bry.dao.BookDAO;
import com.mac.bry.model.Book;

@SpringBootApplication
public class JpAjavaSpringBootApplication {

	public static void main(String[] args) {
		
	ConfigurableApplicationContext context = SpringApplication.run(JpAjavaSpringBootApplication.class, args);
	BookDAO bookDAO = context.getBean(BookDAO.class);
	Book book = new Book("1", "TOLKIEN", "Hobbit");
	bookDAO.addBook(book);
	Book getBook = bookDAO.getBook(1L);
	
	System.out.println(getBook);
	context.close();
	}

}
