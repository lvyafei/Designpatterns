package structureType.bridgePattern;

/**
 * ����ʵ�ֻ���ɫ
 * @author lyf
 *
 */
public class ConcreteImplementor2 implements Implementor {

	@Override
	public void Addition(int a,int b) {
		System.out.println("��ӽ��:"+String.valueOf(a+b));
	}

	@Override
	public void Subtraction(int a,int b) {
		System.out.println("������:"+String.valueOf(a-b));
	}

}
