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
		if (customer.getCustomerState() == "�Ѹ���")
        {
            System.out.println("��������Ա������������");
            dillivierymanState = "�ѷ���";
        }
	}

}
