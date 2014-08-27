package behavioralType.observerPattern;

public class Accountant extends JobStation {

	@SuppressWarnings("unused")
	private String accountantState;
	private Customer customer;

	public Accountant(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void Update() {
		if (customer.getCustomerState() == "已付款") {
			System.out.println("我是会计，我来开具发票。");
			accountantState = "已开发票";
		}
	}
}
