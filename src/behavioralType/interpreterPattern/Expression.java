package behavioralType.interpreterPattern;

import java.util.HashMap;

/** 
 * ������ʽ 
 */  
public abstract class Expression {
	 /** 
     * ������ʽ����ֵ������var�е�key�ǹ�ʽ�Ĳ�����valueֵ�Ǿ�������� 
     * ����Դ��ݽ����Ĳ�����ֵ���н�����ƥ�䣬����key�Ǳ��ʽa+b+c�е�a��b��c��value������ʱȡ�õ�ֵ 
     */  
    // ������ս�����ʽ����ô�˷�������ȡ������ֵ  
    // ����Ƿ��ս�����ʽ����ô�˷������������㣬����Ӽ�  
    public abstract int interpreter(HashMap<String, Integer> var);  
}
