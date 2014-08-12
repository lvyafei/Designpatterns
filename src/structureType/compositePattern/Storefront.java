package structureType.compositePattern;

/**
 * ������ ��������ĵ��沿��
 * @author lyf
 *
 */
public abstract class Storefront {
	//����
    protected String storeName ="";

    public String getStoreName() {
		return storeName;
	}
	//��ӵ���
    public abstract void Add(Storefront store);
    //ɾ������
    public abstract void Remove(Storefront store);
    //�������в������õ���Ϊ ˢ����Ϊ
    public abstract void PayByCard();
}
