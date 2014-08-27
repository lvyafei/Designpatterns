package createType.builderPattern;

public class BenzBuilder implements Builder {

	private Benz benz;

	public BenzBuilder() {
		benz = new Benz();
	}

	@Override
	public void buildCarWheel() {
		// TODO Auto-generated method stub
		 System.out.println("Benz add Wheel");  
	}

	@Override
	public void buildSteeringWheel() {
		// TODO Auto-generated method stub
		System.out.println("Benz add SteeringWheel");  
	}

	@Override
	public void buildEngine() {
		// TODO Auto-generated method stub
		 System.out.println("Benz add engine");  
	}

	@Override
	public void buildCarFrame() {
		// TODO Auto-generated method stub
		System.out.println("Benz add frame");  
	}

	@Override
	public Car getCar() {
		// TODO Auto-generated method stub
		 return benz;  
	}

}
