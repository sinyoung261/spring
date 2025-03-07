package com.yedam.app.book.mapper;

import java.util.List;

import com.yedam.app.book.service.BookVO;

//basePackages ="com.yedam.app.book.mapper"

public interface BookMapper {
	//전체조회
	public List<BookVO> selectAllList();
	
	//도서번호조회
	public BookVO selectNextNo();
	
	//도서등록
	public int insertBookInfo(BookVO bookVO);
}
