package structureType.adapterPattern;

public class Adapter extends Target {

	private Adaptee adaptee=new Adaptee();
	
	@Override
	public void Request() {
		adaptee.SpecificRequest();
	}

}
