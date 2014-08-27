package createType.builderPattern;

public class Director {
    
	private Builder builder ;  
 
    public Director(Builder builder){  
        this.builder = builder ;  
    }  
      
    public void getCarTogether(){  
        builder.buildCarFrame() ;  
        builder.buildEngine();  
        builder.buildCarWheel() ;  
        builder.buildSteeringWheel() ;  
    }  
}
