package com.yedam.app.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.book.mapper.BookMapper;
import com.yedam.app.book.service.BookService;
import com.yedam.app.book.service.BookVO;

@Service //@Transcational 동작
public class BookServiceImpl implements BookService {
	
	private BookMapper bookMapper; // DB에 접속할 Mapper 필요
	
	@Autowired   //생성자 주입
	public BookServiceImpl(BookMapper bookMapper) {
		this.bookMapper = bookMapper;
	}

	@Override
	public List<BookVO> findAll() {
		return bookMapper.selectAllList();
	}

	@Override
	public BookVO findBookNo() {
		return bookMapper.selectNextNo();
	}

	@Override
	public int addInfo(BookVO bookVO) {
		return bookMapper.insertBookInfo(bookVO);
	}

}
