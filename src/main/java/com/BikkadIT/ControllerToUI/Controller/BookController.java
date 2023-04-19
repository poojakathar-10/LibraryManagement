package com.BikkadIT.ControllerToUI.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.BikkadIT.ControllerToUI.Model.Book;
@Controller
public class BookController {
	@GetMapping("/book")
	public ModelAndView getBookData() {
		Book book = new Book();
	    book.setId(111);
	    book.setName("Java");
	    book.setPrice(456.00);
	    
	    ModelAndView mav = new ModelAndView();
	    mav.addObject("Book", book);
	    mav.setViewName("book");
	    
		return mav;
		
	}
	@GetMapping("/getBooks")
	public String getBooks(Model model)
	{
		Book book = new Book();
		book.setId(111);
		book.setName("C");
		book.setPrice(788);
		
		Book book1 = new Book();
		book1.setId(112);
		book1.setName("C++");
		book1.setPrice(123.0);
		
		Book book3 = new Book();
		book3.setId(113);
		book3.setName("java");
		book3.setPrice(422);
		
		Book book4 = new Book();
		book4.setId(114);
		book4.setName("python");
		book4.setPrice(563.00);
		
		List<Book> list = new ArrayList();
		list.add(book);
		list.add(book1);
		list.add(book3);
		list.add(book4);
		
		model.addAttribute("BOOKS", list);
		
		return "books";
		
		
	
		
		
		
	}

}
