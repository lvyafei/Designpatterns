package behavioralType.interpreterPattern;

import java.util.HashMap;

/**
 * �ӷ������� interpreter��������ӷ�����
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	// ���мӷ�����
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}

}
