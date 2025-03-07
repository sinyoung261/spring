package com.yedam.app.book.service;

import java.util.Date;

import lombok.Data;

@Data     //생성자, getter, setter 등
public class BookVO {
	 private Integer bookNo;
	 private String bookName;
	 private String bookCoverimg;
	 //@DateTimeformat(pattern="yyyyMMdd")
	 private Date bookDate;  //yyyy/MM/dd
	 private int bookPrice;
	 private String bookPublisher;
	 private String bookInfo;
	 
	 //도서대여정보
	 private int totalPrice;
	 private int totalCount;
	 
}
