package test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import structureType.adapterPattern.Adapter;
import structureType.adapterPattern.Target;
import structureType.bridgePattern.Abstraction;
import structureType.bridgePattern.ConcreteImplementor1;
import structureType.bridgePattern.Implementor;
import structureType.bridgePattern.RefinedAbstraction;
import structureType.decorativePattern.LowerCaseInputStream;
import structureType.proxyPattern.MathProxy;

public class testStructure {

	@Test 
	/**
	 * 桥接模式
	 */
	public void Testbridge(){
		// 定义一个实现化角色
        Implementor imp = new ConcreteImplementor1();
        // 定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(imp);
        // 执行行文
        System.out.println("调用原来系统的功能");
        abs.requestbaseadd(10, 20);
        abs.requestbasesub(20, 10);
        System.out.println("调用新系统的功能");
        abs.requestnewMultiplication(10, 20);
        abs.requestnewDivision(20, 10);
	}
	@Test
	/**
	 * 装饰模式
	 */
	public void Testdecorative(){
        int c;
		try
		{
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(
					new FileInputStream("D:\\test.txt")));	
			while ((c = in.read()) >= 0)
			{
				System.out.print((char) c);
			}
			in.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	@Test
	/**
	 * 适配器模式
	 */
	public void Testadapter(){
		Target target=new Adapter();
		target.Request();
	}
	@Test
	/**
	 *代理模式
	 */
	public void Testproxy(){
		MathProxy proxy = new MathProxy();
        double addresult = proxy.Add(2,3);
        System.out.println("2+3="+String.valueOf(addresult));
        double subresult = proxy.Sub(2,3);
        System.out.println("2-3="+String.valueOf(subresult));
        double mulresult = proxy.Mul(2,3);
        System.out.println("2*3="+String.valueOf(mulresult));
        double devresult = proxy.Dev(2,3);
        System.out.println("2/3="+String.valueOf(devresult));
	}
}
