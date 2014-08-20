package behavioralType.mediatorPattern;

public class QQMediator extends Mediator {

	@Override
	public void notify(Colleage student) {
		student.talk();
		for(int i=0;i<studentList.size();i++){
			if(student!=studentList.get(i)){
				studentList.get(i).talk();
			}
		}
	}

	@Override
	public void chart(Colleage student1, Colleage student2) {
		student1.talk();
		student2.talk();
	}

}
