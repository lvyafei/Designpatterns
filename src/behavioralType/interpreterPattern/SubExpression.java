package behavioralType.interpreterPattern;

import java.util.HashMap;
/** 
 * 减法解析器 
 * interpreter方法处理减法运算 
 */  
public class SubExpression extends SymbolExpression {
	public SubExpression(Expression left, Expression right) {
		super(left, right);
	}
	// 进行减法运算
	@Override
	public int interpreter(HashMap<String, Integer> var) {
		// TODO Auto-generated method stub
		return 0;
	}

}
