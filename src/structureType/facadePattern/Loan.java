package structureType.facadePattern;

public class Loan {
	
	public Boolean HasNoBadLoans(Customer c)
    {
        System.out.println("Check loans for " + c.getName());
        return true;
    }
}
