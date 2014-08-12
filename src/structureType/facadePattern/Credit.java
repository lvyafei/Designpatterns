package structureType.facadePattern;

public class Credit {
	
	public Boolean HasGoodCredit(Customer c)
    {
        System.out.println("Check credit for " + c.getName());
        return true;
    }
}
