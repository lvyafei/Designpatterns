package structureType.facadePattern;

public class Bank {
	
	public Boolean HasSufficientSavings(Customer c, int amount)
    {
		 System.out.println("Check bank for " + c.getName());
	        return true;
    }
}
