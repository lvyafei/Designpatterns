package createType.prototypePattern;

public class Prototype implements Cloneable {

	@Override
	public Object clone() throws CloneNotSupportedException {
		Prototype prototype = null;  
        try{  
            prototype = (Prototype)super.clone();  
        }catch(CloneNotSupportedException e){  
            e.printStackTrace();  
        }  
        return prototype;   
	}

}
