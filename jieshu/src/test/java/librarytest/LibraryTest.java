package librarytest;

import java.util.List;

import org.junit.Test;

import library.Book;
import library.Loan;
import library.Member;

public class LibraryTest {
	
	private Book book1,book2,book3,book4;
	private Member member1,member2,member3;	
	
	public void addMember(){
		member1 = new Member();
		member1.setId("1");
		member1.setName("海绵宝宝");
	}
	
	public void addBook(){
		book1 = new Book();
		book2 = new Book();
		book3 = new Book();
		book4 = new Book();
		book1.setId("1");
		book1.setISBN("CT1");
		book1.setTitle("网络金融");
		book1.setLoanTo(null);
		book2.setId("2");
		book2.setISBN("CT2");
		book2.setTitle("会计学");
		book2.setLoanTo(null);
		book3.setId("3");
		book3.setISBN("CT3");
		book3.setTitle("高等数学");
		book3.setLoanTo(null);
		book4.setId("4");
		book4.setISBN("CT4");
		book4.setTitle("大学英语");
		book4.setLoanTo(null);
	}
	
	@Test
	public void loanSuccess(){
		this.addMember(); 
		this.addBook();
		member1.Loan(book1);
		member1.Loan(book2);
		member1.Loan(book3);
		
		System.out.println("姓名：" + member1.getName());
		System.out.println("书名：" + book1.getTitle() + "；" + book2.getTitle() + "；" + book3.getTitle());
		System.out.println("时间：" + member1.getLoans().get(0).getLoanDate());
		
	}
	@Test
	public void loanFail(){
		this.loanSuccess();
		member1.Loan(book1);
		if(member1.validate(book1)==false){
			System.out.println("借书失败");
		}
	}
	@Test
	public void returnBook(){
		this.loanSuccess();
		member1.Return(book1);
		System.out.println("还书");
		System.out.println("姓名：" + member1.getName());
		System.out.println("书名：" + book1.getTitle());
	}
}
