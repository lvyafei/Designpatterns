package createType.singletonPattern;

public class EmperorNew {
	//����һ���ʵ۷������Ȼ�������ʵ��������  
    private static final EmperorNew emperorNew = new EmperorNew();;  
      
    private EmperorNew(){  
        //���׺͵��µ�Լ���㣬Ŀ�ľͲ���������ڶ����ʵ�  
    }  
      
    public  synchronized static  EmperorNew getInstance(){  
          
        return emperorNew;  
    }  
      
    //�ʵ۽�ʲô����ѽ  
    public static void emperorInfo(){  
        System.out.println("���ǻʵ�ĳĳĳ...����");  
    }  
}
