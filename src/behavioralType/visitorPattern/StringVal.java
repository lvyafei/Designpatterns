package behavioralType.visitorPattern;

public class StringVal implements Visitor {
	String s; 
	public String toString() { return s; }
	@Override
	public void visit(Gladiolus g) {
		s = "Gladiolus"; 
	}

	@Override
	public void visit(Runuculus r) {
		s = "Runuculus"; 
	}

	@Override
	public void visit(Chrysanthemum c) {
		s = "Chrysanthemum"; 
	}

}
