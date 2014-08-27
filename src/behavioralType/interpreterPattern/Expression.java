package behavioralType.interpreterPattern;

import java.util.HashMap;

/** 
 * 抽象表达式 
 */  
public abstract class Expression {
	 /** 
     * 解析公式和数值，其中var中的key是公式的参数，value值是具体的数字 
     * 负责对传递进来的参数和值进行解析和匹配，其中key是表达式a+b+c中的a、b、c，value是运算时取得的值 
     */  
    // 如果是终结符表达式，那么此方法将获取参数的值  
    // 如果是非终结符表达式，那么此方法将进行运算，比如加减  
    public abstract int interpreter(HashMap<String, Integer> var);  
}
