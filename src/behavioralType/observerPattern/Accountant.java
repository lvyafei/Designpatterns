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
		if (customer.getCustomerState() == "�Ѹ���") {
			System.out.println("���ǻ�ƣ��������߷�Ʊ��");
			accountantState = "�ѿ���Ʊ";
		}
	}
}
