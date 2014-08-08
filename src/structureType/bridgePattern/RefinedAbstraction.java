package structureType.bridgePattern;

/**
 * 具体抽象化角色
 * @author lyf
 *
 */
public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor _imp) {
		super(_imp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void requestbaseadd(int a, int b) {
		// TODO Auto-generated method stub
		super.requestbaseadd(a, b);
	}

	@Override
	public void requestbasesub(int a, int b) {
		// TODO Auto-generated method stub
		super.requestbasesub(a, b);
	}

	@Override
	public void requestnewMultiplication(int a, int b) {
		// TODO Auto-generated method stub
		super.requestnewMultiplication(a, b);
	}

	@Override
	public void requestnewDivision(int a, int b) {
		// TODO Auto-generated method stub
		super.requestnewDivision(a, b);
	}
}
