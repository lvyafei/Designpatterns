package behavioralType.visitorPattern;

public class Chrysanthemum implements Flower {

	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
