package createType.singletonPattern;

public class EmperorNew {
	//定义一个皇帝放在那里，然后给这个皇帝起个名字  
    private static final EmperorNew emperorNew = new EmperorNew();;  
      
    private EmperorNew(){  
        //世俗和道德的约束你，目的就不让你产生第二个皇帝  
    }  
      
    public  synchronized static  EmperorNew getInstance(){  
          
        return emperorNew;  
    }  
      
    //皇帝叫什么名字呀  
    public static void emperorInfo(){  
        System.out.println("我是皇帝某某某...阿福");  
    }  
}
