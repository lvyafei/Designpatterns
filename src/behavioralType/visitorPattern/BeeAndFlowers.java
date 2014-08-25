package behavioralType.visitorPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BeeAndFlowers {
	List<Flower> flowers = new ArrayList<Flower>();

	public BeeAndFlowers() {
		for (int i = 0; i < 10; i++)
			flowers.add(FlowerGenerator.newFlower());
	}

	Visitor sval;

	public void test() {
	   sval = new StringVal();
	   Iterator<Flower> it=flowers.iterator();
	   while(it.hasNext()){
		   ((Flower)it.next()).accept(sval);
		   System.out.println(sval);
	   }
	}
}
