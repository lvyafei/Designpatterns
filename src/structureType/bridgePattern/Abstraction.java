package structureType.bridgePattern;

/**
 * 抽象化角色
 * @author lyf
 *
 */
public abstract class Abstraction {
	// 定义对实现化角色的引用
    private Implementor imp;
    // 获得实现化角色
    public Implementor getImp() {
        return this.imp;
    }
    // 约束子类必须实现该构造函数
    public Abstraction(Implementor _imp) {
        this.imp = _imp;
    }

    // 自身的行为和属性
    public void requestbaseadd(int a,int b) {
        this.imp.Addition(a, b);
    }
    // 自身的行为和属性
    public void requestbasesub(int a,int b) {
        this.imp.Subtraction(a, b);
    }
    public void requestnewMultiplication(int a,int b){
    	System.out.println("相乘结果:"+String.valueOf(a*b));
    }
    public void requestnewDivision(int a,int b){
    	System.out.println("相除结果:"+String.valueOf(a/b));
    }
   
}
