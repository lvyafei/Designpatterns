package behavioralType.interpreterPattern;

import java.util.HashMap;
/** 
 * ���������� 
 * interpreter��������������� 
 */  
public class SubExpression extends SymbolExpression {
	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}
	// ���м�������
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}

}
