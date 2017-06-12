package library;

import java.time.LocalDate;
import java.util.UUID;

public class LoanFactory {
	public static Loan CreateLoan(Book book,Member member){
		Loan loan = new Loan();
		loan.Id = UUID.randomUUID().toString();
		loan.Book = book;
		loan.menmber = member;
		loan.LoanDate = LocalDate.now();
		loan.DateForReturn = LocalDate.now().plusDays(10);
		book.setLoanTo(member);
		return loan;
	}
}
