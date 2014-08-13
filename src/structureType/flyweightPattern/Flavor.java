package structureType.flyweightPattern;

public class Flavor extends Order {

	private String flavor;

	// 构造函数，内蕴状态以参数方式传入
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
