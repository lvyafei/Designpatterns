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
		 if (customer.getCustomerState() == "�Ѹ���")
         {
             System.out.println("���ǳ���Ա���Ҹ��Ǽ����ˡ�");
             cashierState = "������";
         }
	}

}
