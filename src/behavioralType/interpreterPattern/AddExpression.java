package behavioralType.interpreterPattern;

import java.util.HashMap;

/**
 * 加法解析器 interpreter方法处理加法运算
 */
public class AddExpression extends SymbolExpression {

	public AddExpression(Expression left, Expression right) {
		super(left, right);
	}

	// 进行加法运算
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		return super.left.interpreter(var) + super.right.interpreter(var);
	}

}
