package createType.singletonPattern;

public class Emperor {
	//定义一个皇帝放在那里，然后给这个皇帝起个名字  
    private static Emperor emperor = null;  
      
    private Emperor(){  
        //世俗和道德的约束你，目的就不让你产生第二个皇帝  
    }  
      
    public static Emperor getInstance(){  
        if(emperor==null){  
            emperor = new Emperor();  
            System.out.println("我是新来的皇上");
        }else{
        	System.out.println("我又当了一年的皇上了");
        }  
        return emperor;  
    }  
      
    //皇帝叫什么名字呀  
    public void emperorInfo(){  
        System.out.println("我是皇帝某某某...阿福");  
    }  
}
