package behavioralType.interpreterPattern;


/** 
 * 抽象运算符解析器 
 * 非终结符表达式 
 */ 
public abstract class SymbolExpression extends Expression {

	// 每个运算符都有左右两个参数进行运算，因此抽象到父类中  
    protected Expression left;  
    protected Expression right;  
  
    public SymbolExpression(Expression left, Expression right)  
    {  
        this.left = left;  
        this.right = right;  
    }
}
