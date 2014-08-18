package behavioralType.interpreterPattern;

import java.util.HashMap;
import java.util.Stack;

/** 
 * 对输入的表达式进行解析，并计算 
 */  
public class Context {
	 // 定义表达式，最后拿到是一个运算解析器，比如X+Y格式的，其中X可能又是由A+B的运算解析器组成  
    // 只有最底层的解析器才是变量解析器，也就是终结符表达式  
    // 此参数最终得到的肯定是非终结表达式  
    private Expression expression;  
      
    /** 
     * 分析用户输入的表达式 
     */  
    public void analyse(String expStr) {  
        // 定义一个栈，安排运算的先后顺序  
        Stack<Expression> stack = new Stack<Expression>();  
        char[] charArray = expStr.toCharArray();  
        Expression left = null;  
        Expression right = null;  
        for(int i=0; i<charArray.length; i++)  
        {  
            switch(charArray[i])  
            {  
            case '+':  
                // 将加法运算加入到栈中  
                left = stack.pop();  
                right = new VarExpression(String.valueOf(charArray[++i]));  
                stack.push(new AddExpression(left, right));  
                break;  
            case '-':  
                // 将减法运算加入到栈中  
                left = stack.pop();  
                right = new VarExpression(String.valueOf(charArray[++i]));  
                stack.push(new SubExpression(left, right));  
                break;  
            default:  
                // 如果不是运算符，那么就是终结表达式  
                stack.push(new VarExpression(String.valueOf(charArray[i])));  
            }  
        }  
        // 把最终栈的顶层抛出，它即是最后封装的非终结表达式  
        this.expression = stack.pop();  
    }  
      
    // 将键值对输入给表达式运算  
    public int run(HashMap<String, Integer> var)  
    {  
        return expression.interpreter(var);  
    }  
}
