package structureType.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class StoreOrBranch extends Storefront {

	 //构造函数
    public StoreOrBranch() { }
    public StoreOrBranch(String storeName)
    {
        this.storeName = storeName;
    }
    List<Storefront> myStoreList = new ArrayList<Storefront>();
	
    @Override
	public void Add(Storefront store) {
		// TODO Auto-generated method stub
    	myStoreList.add(store);
	}

	@Override
	public void Remove(Storefront store) {
		// TODO Auto-generated method stub
		myStoreList.remove(store);
	}
	/**
	 * 刷卡消费
	 */
	@Override
	public void PayByCard() {
		System.out.println("店面:"+storeName+"的积分已累加进该会员卡");
		for (Storefront sf : myStoreList) {
			sf.PayByCard();
		}
	}
}
