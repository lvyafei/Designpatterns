package structureType.compositePattern;

public class JoinInStore extends Storefront {

	//���캯��
    public JoinInStore() { }
    
    public JoinInStore(String storeName)
    {
        this.storeName = storeName;
    }
	@Override
	public void Add(Storefront store) {
		// TODO Auto-generated method stub
		System.out.println("�������");
	}

	@Override
	public void Remove(Storefront store) {
		// TODO Auto-generated method stub
		System.out.println("����ɾ��");
	}

	@Override
	public void PayByCard() {
		// TODO Auto-generated method stub
		System.out.println("����:"+storeName+"�Ļ������ۼӽ��û�Ա��");
	}

}
