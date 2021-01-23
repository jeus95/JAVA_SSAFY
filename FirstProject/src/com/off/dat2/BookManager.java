package com.off.dat2;

import java.util.Arrays;

public class BookManager {
	
		Book[] bookList;
		int  cnt=0; //�迭�� ����� å�� �� 
		final int MAX=100;
		public BookManager() {
			bookList = new Book[MAX];
		}
		public void addBook(Book b) {
//				System.out.println(b.getIsbn());
			if(cnt < MAX)	{
				bookList[cnt++] =b;
//				bookList[cnt].setIsbn(b.getIsbn());			
//				bookList[cnt].setTitle(b.getTitle());			
//				bookList[cnt].setAuthor(b.getAuthor());			
//				bookList[cnt].setPublisher(b.getPublisher());			
//				bookList[cnt].setPrice(b.getPrice());
//				bookList[cnt].setDesc(b.getDesc());
				
			}
		}
		public void remove(String isbn) {
			for(int i=0;i<cnt;i++) {
				Book one = bookList[i];
				if(one.getIsbn().equals(isbn)) {
					bookList[i] = bookList[cnt -1]; //�Ǹ����� ���� ������ ����
					bookList[cnt -1] = null;//�� ������ ���� null�� �ٲ��ְ�
					cnt--; //ī��Ʈ�� �ϳ� ����
					break; //��ǥ �� ������ �ڿ� break������ ����
				}
			}
		}
		
		public Book[] getList( ) {
			
				return Arrays.copyOfRange(bookList, 0, cnt);
				//return bookList;
			
		}
		
		public Book searchByIsbn(String isbn) {
			for(int i=0;i<cnt;i++) {
				if(bookList[i].getIsbn().equals(isbn)) {
					return bookList[i];
				}
			}
			return null;
			
		}
}
