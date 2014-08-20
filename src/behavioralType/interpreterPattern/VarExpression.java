package behavioralType.interpreterPattern;

import java.util.HashMap;

/** 
 * ���������� 
 * �ս������ʽ 
 */  
public class VarExpression extends Expression {

	private String key;  
	  
    public VarExpression(String key)   
    {  
        this.key = key;  
    }  
  
    // ��map��ȡ��ֵ  
    @Override  
    public int interpreter(HashMap<String, Integer> var) {  
        return var.get(key);  
    }  

}