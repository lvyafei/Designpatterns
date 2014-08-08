package test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;

import structureType.bridgePattern.Abstraction;
import structureType.bridgePattern.ConcreteImplementor1;
import structureType.bridgePattern.Implementor;
import structureType.bridgePattern.RefinedAbstraction;
import structureType.decorativePattern.LowerCaseInputStream;

public class testStructure {

	@Test 
	/**
	 * �Ž�ģʽ
	 */
	public void Testbridge(){
		// ����һ��ʵ�ֻ���ɫ
        Implementor imp = new ConcreteImplementor1();
        // ����һ�����󻯽�ɫ
        Abstraction abs = new RefinedAbstraction(imp);
        // ִ������
        System.out.println("����ԭ��ϵͳ�Ĺ���");
        abs.requestbaseadd(10, 20);
        abs.requestbasesub(20, 10);
        System.out.println("������ϵͳ�Ĺ���");
        abs.requestnewMultiplication(10, 20);
        abs.requestnewDivision(20, 10);
	}
	@Test
	/**
	 * װ��ģʽ
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
}