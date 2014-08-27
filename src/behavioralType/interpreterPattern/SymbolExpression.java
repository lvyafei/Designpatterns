package behavioralType.interpreterPattern;


/** 
 * ��������������� 
 * ���ս�����ʽ 
 */ 
public abstract class SymbolExpression extends Expression {

	// ÿ������������������������������㣬��˳��󵽸�����  
    protected Expression left;  
    protected Expression right;  
  
    public SymbolExpression(Expression left, Expression right)  
    {  
        this.left = left;  
        this.right = right;  
    }
}
