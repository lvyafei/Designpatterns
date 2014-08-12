package structureType.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class StoreOrBranch extends Storefront {

	 //���캯��
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
	 * ˢ������
	 */
	@Override
	public void PayByCard() {
		System.out.println("����:"+storeName+"�Ļ������ۼӽ��û�Ա��");
		for (Storefront sf : myStoreList) {
			sf.PayByCard();
		}
	}
}
