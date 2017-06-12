package library;


import java.time.LocalDate;

public class Loan {
	public String Id;
	public LocalDate LoanDate;
	public LocalDate DateForReturn;
	public LocalDate ReturnDate;
	public Book Book;
	public Member menmber;
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public LocalDate getLoanDate() {
		return LoanDate;
	}
	public void setLoanDate(LocalDate loanDate) {
		LoanDate = loanDate;
	}
	public LocalDate getDateForReturn() {
		return DateForReturn;
	}
	public void setDateForReturn(LocalDate dateForReturn) {
		DateForReturn = dateForReturn;
	}
	public LocalDate getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		ReturnDate = returnDate;
	}
	public Book getBook() {
		return Book;
	}
	public void setBook(Book book) {
		Book = book;
	}
	public Member getMenmber() {
		return menmber;
	}
	public void setMenmber(Member menmber) {
		this.menmber = menmber;
	}

	public boolean HasNotBeenReturn(){
		return ReturnDate == null;
	}
	
	public void MarkAsReturned(){
		ReturnDate = LocalDate.now();
	}
}
