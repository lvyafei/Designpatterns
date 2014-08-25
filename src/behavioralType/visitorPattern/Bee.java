package behavioralType.visitorPattern;

public class Bee implements Visitor {

	@Override
	public void visit(Gladiolus g) {
		System.out.println("Bee and Gladiolus");
	}

	@Override
	public void visit(Runuculus r) {
		System.out.println("Bee and Runuculus");
	}

	@Override
	public void visit(Chrysanthemum c) {
		System.out.println("Bee and Chrysanthemum");
	}

}
