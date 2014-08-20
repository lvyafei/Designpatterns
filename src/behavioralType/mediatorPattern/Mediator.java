package behavioralType.mediatorPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {

	public List<Colleage> studentList=new ArrayList<Colleage>();

	public void add_student(Colleage student) {
		studentList.add(student);
	};

	abstract void notify(Colleage student);

	abstract void chart(Colleage student1, Colleage student2);
}
