package behavioralType.observerPattern;

public class Dilliveryman extends JobStation {
	@SuppressWarnings("unused")
	private String dillivierymanState;
    private Customer customer;

    public Dilliveryman(Customer customer)
    {
        this.customer = customer;
    }

	@Override
	public void Update() {
		if (customer.getCustomerState() == "已付款")
        {
            System.out.println("我是配送员，我来发货。");
            dillivierymanState = "已发货";
        }
	}

}
