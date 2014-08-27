package behavioralType.mediatorPattern;

public class TuanZhiShu extends Colleage {

	@Override
	void talk() {
		System.out.println("团支书 说："+getContent());
	}

}
