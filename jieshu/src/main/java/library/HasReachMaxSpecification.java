package library;

import java.util.List;

public class HasReachMaxSpecification implements ISpecification<Member> {
	
	public boolean isSatisfiedBy(Member member) {
		boolean mm = false;
		List<Loan> list = member.getLoans();
		if(list == null || list.size()<3){
			mm=true;
		}
		return mm;
		
	}

}
