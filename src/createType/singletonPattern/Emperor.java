package createType.singletonPattern;

public class Emperor {
	//����һ���ʵ۷������Ȼ�������ʵ��������  
    private static Emperor emperor = null;  
      
    private Emperor(){  
        //���׺͵��µ�Լ���㣬Ŀ�ľͲ���������ڶ����ʵ�  
    }  
      
    public static Emperor getInstance(){  
        if(emperor==null){  
            emperor = new Emperor();  
            System.out.println("���������Ļ���");
        }else{
        	System.out.println("���ֵ���һ��Ļ�����");
        }  
        return emperor;  
    }  
      
    //�ʵ۽�ʲô����ѽ  
    public void emperorInfo(){  
        System.out.println("���ǻʵ�ĳĳĳ...����");  
    }  
}
