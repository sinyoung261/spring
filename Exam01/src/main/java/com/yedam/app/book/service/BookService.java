package com.yedam.app.book.service;

import java.util.List;

public interface BookService {
	public List<BookVO> findAll();
	
	public BookVO findBookNo();
	
	public int addInfo(BookVO bookVO);
}
