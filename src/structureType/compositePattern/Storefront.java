package structureType.compositePattern;

/**
 * 店面类 抽象出来的店面部件
 * @author lyf
 *
 */
public abstract class Storefront {
	//店名
    protected String storeName ="";

    public String getStoreName() {
		return storeName;
	}
	//添加店面
    public abstract void Add(Storefront store);
    //删除店面
    public abstract void Remove(Storefront store);
    //定义所有部件公用的行为 刷卡行为
    public abstract void PayByCard();
}
