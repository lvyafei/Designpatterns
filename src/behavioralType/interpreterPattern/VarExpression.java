package behavioralType.interpreterPattern;

import java.util.HashMap;

/** 
 * 变量解析器 
 * 终结符表达式 
 */  
public class VarExpression extends Expression {

	private String key;  
	  
    public VarExpression(String key)   
    {  
        this.key = key;  
    }  
  
    // 从map中取得值  
    @Override  
    public int interpreter(HashMap<String, Integer> var) {  
        return var.get(key);  
    }  

}
