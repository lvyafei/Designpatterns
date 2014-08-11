package structureType.adapterPattern;

/**
 *  定义客户端期待的接口
 * @author lyf
 *
 */
public class Target {

	/**
	 * 使用virtual修饰以便子类可以重写
	 */
	 public void Request()
     {
         System.out.println("This is a common request");
     }
}
