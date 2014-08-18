package behavioralType.interpreterPattern;

import java.util.HashMap;
import java.util.Stack;

/** 
 * ������ı��ʽ���н����������� 
 */  
public class Context {
	 // ������ʽ������õ���һ�����������������X+Y��ʽ�ģ�����X����������A+B��������������  
    // ֻ����ײ�Ľ��������Ǳ�����������Ҳ�����ս�����ʽ  
    // �˲������յõ��Ŀ϶��Ƿ��ս���ʽ  
    private Expression expression;  
      
    /** 
     * �����û�����ı��ʽ 
     */  
    public void analyse(String expStr) {  
        // ����һ��ջ������������Ⱥ�˳��  
        Stack<Expression> stack = new Stack<Expression>();  
        char[] charArray = expStr.toCharArray();  
        Expression left = null;  
        Expression right = null;  
        for(int i=0; i<charArray.length; i++)  
        {  
            switch(charArray[i])  
            {  
            case '+':  
                // ���ӷ�������뵽ջ��  
                left = stack.pop();  
                right = new VarExpression(String.valueOf(charArray[++i]));  
                stack.push(new AddExpression(left, right));  
                break;  
            case '-':  
                // ������������뵽ջ��  
                left = stack.pop();  
                right = new VarExpression(String.valueOf(charArray[++i]));  
                stack.push(new SubExpression(left, right));  
                break;  
            default:  
                // ����������������ô�����ս���ʽ  
                stack.push(new VarExpression(String.valueOf(charArray[i])));  
            }  
        }  
        // ������ջ�Ķ����׳�������������װ�ķ��ս���ʽ  
        this.expression = stack.pop();  
    }  
      
    // ����ֵ����������ʽ����  
    public int run(HashMap<String, Integer> var)  
    {  
        return expression.interpreter(var);  
    }  
}
