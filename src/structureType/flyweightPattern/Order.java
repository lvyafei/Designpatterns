package structureType.flyweightPattern;

public abstract class Order {
	// 将咖啡卖给客人
	  public abstract void Serve(Table table);
	  // 返回咖啡的名字
	  public abstract String GetFlavor();
}
