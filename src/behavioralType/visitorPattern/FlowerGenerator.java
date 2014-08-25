package behavioralType.visitorPattern;

import java.util.Random;

public class FlowerGenerator {
	private static Random rand = new Random();

	public static Flower newFlower() {
		Flower result=null;
		switch (rand.nextInt(3)) {
		case 0:
			result=new Gladiolus();
			break;
		case 1:
			result=new Runuculus();
			break;
		case 2:
			result=new Chrysanthemum();
			break;
		default:
			break;
		}
		return result;
	}
}
