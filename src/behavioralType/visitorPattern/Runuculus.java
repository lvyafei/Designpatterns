package behavioralType.visitorPattern;

public class Runuculus implements Flower {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
