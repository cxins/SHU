package library;

import java.util.List;

public class LoanOnlySpecification implements ISpecification<Member> {
	private Book wantBook;
	
	public LoanOnlySpecification(Book wantBook){
		this.wantBook = wantBook;
	}
	public boolean isSatisfiedBy(Member member) {
		boolean mm = false;
		List<Loan> list = member.getLoans();
		if(list == null){
			mm=true; 
		}else{
			for(Loan loan:list){
				if(loan.getBook().getISBN()!=wantBook.getISBN()){
					mm=true;
				}
			}
		}
		
		return mm;
	}
	
}
