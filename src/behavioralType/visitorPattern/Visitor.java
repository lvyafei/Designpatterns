package behavioralType.visitorPattern;

public interface  Visitor {
	void visit(Gladiolus g);
	void visit(Runuculus r);
	void visit(Chrysanthemum c);
}
