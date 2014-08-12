package structureType.facadePattern;

public class Mortgage {
	
	private Bank bank = new Bank();
    private Loan loan = new Loan();
    private Credit credit = new Credit();

    public Boolean IsEligible(Customer cust, int amount)
    {
        System.out.println(cust.getName()+" applies for "+amount+" loan\n");
        Boolean eligible = true;

        if (!bank.HasSufficientSavings(cust, amount))
        {
            eligible = false;
        }
        else if (!loan.HasNoBadLoans(cust))
        {
            eligible = false;
        }
        else if (!credit.HasGoodCredit(cust))
        {
            eligible = false;
        }
        return eligible;
    }
}
