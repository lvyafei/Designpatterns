package structureType.flyweightPattern;

public class Flavor extends Order {

	private String flavor;

	// ���캯��������״̬�Բ�����ʽ����
	public Flavor(String flavor) {
		this.flavor = flavor;
	}

	@Override
	public void Serve(Table table) {
		// TODO Auto-generated method stub
        System.out.println("Serving table "+String.valueOf(table.getNumber())+" with flavor "+flavor);
	}

	@Override
	public String GetFlavor() {
		// TODO Auto-generated method stub
		return this.flavor;
	}
}
