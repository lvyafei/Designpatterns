package structureType.bridgePattern;

/**
 * 具体实现化角色
 * @author lyf
 *
 */
public class ConcreteImplementor2 implements Implementor {

	@Override
	public void Addition(int a,int b) {
		System.out.println("相加结果:"+String.valueOf(a+b));
	}

	@Override
	public void Subtraction(int a,int b) {
		System.out.println("相减结果:"+String.valueOf(a-b));
	}

}
