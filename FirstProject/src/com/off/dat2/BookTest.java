package com.off.dat2;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookManager man = new BookManager();
		Book b = new Book("1234","SSAFt","전재우","미래사",10000,"??");

		Book b2 = new Book("0001","코딩테스트","재우전","삼성",100000,"코테 기본서");
		
		
		//System.out.println(b.toString());
		//System.out.println(b2); //자동으로 toString()이 호출됨
		
		man.addBook(b2);
		man.addBook(b);
		Book[]list = man.getList();
		for(Book bb:list)
			System.out.println(bb);
		System.out.println("========================");
		man.remove("0001");
		
		for(Book z : man.getList()) {
			if( z.getIsbn() != null) {
				System.out.println(z);
			}
		}
		//System.out.println("1");
		System.out.println("========================");
		
		System.out.println(man.searchByIsbn("1234"));
		System.out.println("========================");
	
	}

}
