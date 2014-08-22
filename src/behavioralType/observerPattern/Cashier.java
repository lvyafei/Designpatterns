package behavioralType.observerPattern;

public class Cashier extends JobStation {

	@SuppressWarnings("unused")
	private String cashierState;
    private Customer customer;

    public Cashier(Customer customer)
    {
        this.customer = customer;
    }

	@Override
	public void Update() {
		 if (customer.getCustomerState() == "已付款")
         {
             System.out.println("我是出纳员，我给登记入账。");
             cashierState = "已入账";
         }
	}

}
