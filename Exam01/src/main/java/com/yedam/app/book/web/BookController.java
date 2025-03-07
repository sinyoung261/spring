package com.yedam.app.book.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.app.book.service.BookService;
import com.yedam.app.book.service.BookVO;

@Controller
public class BookController {
	
	private BookService bookService;
	
	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	/*
	 * 1) URL + HTTP Method
	 * 2) Service
	 * 3) View
	 */
	
	// 도서목록 => 조회 기능 => GET
	@GetMapping("bookList")  //1) URL + HTTP Method
	public String bookList(Model model) {
		
		 // 2) Service
		List<BookVO> list = bookService.findAll();
		// 2-1) Service의 결과를 View에 전달
		model.addAttribute("books", list);
		 // 3) View
		return "book/list";
		// prefix : classpath:/templates/
		// suffix : .html
		// classpath:/templates/book/list.html
	}
	
	// 등록 - 페이지 => GET
	@GetMapping("bookInsert")
	public String bookInsertForm(Model model) {
		BookVO bookVO = bookService.findBookNo();
		model.addAttribute("book" ,bookVO);
		return "book/insert";
		// prefix : classpath:/templates/
		// suffix : .html
		// classpath:/templates/book/insert.html
		}
	
	// 등록 - 처리  => 데이터 등록 및 수정 => POST
	@PostMapping("bookInsert") // 커맨드 객체, QueryString => <form>의 submit
	public String bookInsertProcess(BookVO bookVO) {
		bookService.addInfo(bookVO);
		return "redirect:bookList";
		// prefix : classpath:/templates/
		// suffix : .html
		// classpath:/templates/book/insert.html
		}
}
