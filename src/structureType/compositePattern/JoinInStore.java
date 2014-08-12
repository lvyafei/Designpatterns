package structureType.compositePattern;

public class JoinInStore extends Storefront {

	//构造函数
    public JoinInStore() { }
    
    public JoinInStore(String storeName)
    {
        this.storeName = storeName;
    }
	@Override
	public void Add(Storefront store) {
		// TODO Auto-generated method stub
		System.out.println("不能添加");
	}

	@Override
	public void Remove(Storefront store) {
		// TODO Auto-generated method stub
		System.out.println("不能删除");
	}

	@Override
	public void PayByCard() {
		// TODO Auto-generated method stub
		System.out.println("店面:"+storeName+"的积分已累加进该会员卡");
	}

}
