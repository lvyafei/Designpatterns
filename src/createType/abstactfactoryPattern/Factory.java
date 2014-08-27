package createType.abstactfactoryPattern;

public class Factory implements IFactory {

	@Override
	public IProduct1 createProduct1() {
		// TODO Auto-generated method stub
		return new Product1();  
	}

	@Override
	public IProduct2 createProduct2() {
		// TODO Auto-generated method stub
		return new Product2();  
	}

}
