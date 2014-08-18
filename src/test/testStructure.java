package test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.junit.Test;

import behavioralType.commandPattern.CommandChange;
import behavioralType.commandPattern.CommandOff;
import behavioralType.commandPattern.CommandOn;
import behavioralType.commandPattern.Control;
import behavioralType.commandPattern.Tv;
import behavioralType.interpreterPattern.Context;
import behavioralType.responsibilityPattern.DeptManager;
import behavioralType.responsibilityPattern.GeneralManager;
import behavioralType.responsibilityPattern.Handler;
import behavioralType.responsibilityPattern.ProjectManager;
import structureType.adapterPattern.Adapter;
import structureType.adapterPattern.Target;
import structureType.bridgePattern.Abstraction;
import structureType.bridgePattern.ConcreteImplementor1;
import structureType.bridgePattern.Implementor;
import structureType.bridgePattern.RefinedAbstraction;
import structureType.compositePattern.JoinInStore;
import structureType.compositePattern.StoreOrBranch;
import structureType.decorativePattern.LowerCaseInputStream;
import structureType.facadePattern.Customer;
import structureType.facadePattern.Mortgage;
import structureType.flyweightPattern.FlavorFactory;
import structureType.flyweightPattern.Order;
import structureType.flyweightPattern.Table;
import structureType.proxyPattern.MathProxy;

public class testStructure {

	@Test
	/**
	 * �Ž�ģʽ
	 */
	public void Testbridge() {
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
	public void Testdecorative() {
		int c;
		try {
			InputStream in = new LowerCaseInputStream(new BufferedInputStream(
					new FileInputStream("D:\\test.txt")));
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	/**
	 * ������ģʽ
	 */
	public void Testadapter() {
		Target target = new Adapter();
		target.Request();
	}

	@Test
	/**
	 *����ģʽ
	 */
	public void Testproxy() {
		MathProxy proxy = new MathProxy();
		double addresult = proxy.Add(2, 3);
		System.out.println("2+3=" + String.valueOf(addresult));
		double subresult = proxy.Sub(2, 3);
		System.out.println("2-3=" + String.valueOf(subresult));
		double mulresult = proxy.Mul(2, 3);
		System.out.println("2*3=" + String.valueOf(mulresult));
		double devresult = proxy.Dev(2, 3);
		System.out.println("2/3=" + String.valueOf(devresult));
	}

	@Test
	/**
	 * ���ģʽ
	 */
	public void Testfacade() {
		// ���
		Mortgage mortgage = new Mortgage();
		Customer customer = new Customer("Ann McKinsey");
		Boolean eligable = mortgage.IsEligible(customer, 125000);
		System.out.println("\n" + customer.getName() + " has been "
				+ (eligable ? "Approved" : "Rejected"));
	}

	@Test
	/**
	 * ���ģʽ
	 */
	public void Testcomposite() {
		StoreOrBranch store = new StoreOrBranch("�����ܵ�");
		StoreOrBranch brach = new StoreOrBranch("���Ƿֵ�");
		JoinInStore jstore = new JoinInStore("������˵�һ");
		JoinInStore jstore1 = new JoinInStore("�ϵؼ��˵��");

		brach.Add(jstore);
		brach.Add(jstore1);
		store.Add(brach);

		store.PayByCard();
	}

	private static FlavorFactory flavorFactory;
	private static int ordersMade = 0;

	@Test
	/**
	 * ��Ԫģʽ
	 */
	public void Testflyweight() {
		flavorFactory = new FlavorFactory();

		TakeOrder("Black Coffee");
		TakeOrder("Capucino");
		TakeOrder("Espresso");
		TakeOrder("Capucino");
		TakeOrder("Espresso");
		TakeOrder("Black Coffee");
		TakeOrder("Espresso");
		TakeOrder("Espresso");
		TakeOrder("Black Coffee");
		TakeOrder("Capucino");
		TakeOrder("Capucino");
		TakeOrder("Black Coffee");

		System.out.println("\nTotal Orders made: " + ordersMade);

		System.out.println("\nTotal Flavor objects made: "
				+ flavorFactory.GetTotalFlavorsMade());
	}

	private static void TakeOrder(String aFlavor) {
		Order o = flavorFactory.GetOrder(aFlavor);
		// ��������������
		o.Serve(new Table(++ordersMade));
	}

	@Test
	/**
	 * ������ģʽ
	 */
	public void testresponsibility() {
		// ��Ҫ��װ������
		Handler h1 = new GeneralManager();
		Handler h2 = new DeptManager();
		Handler h3 = new ProjectManager();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);

		// ��ʼ����
		String test1 = h3.handleFeeRequest("����", 300);
		System.out.println("test1 = " + test1);
		String test2 = h3.handleFeeRequest("����", 300);
		System.out.println("test2 = " + test2);
		System.out.println("---------------------------------------");

		String test3 = h3.handleFeeRequest("����", 700);
		System.out.println("test3 = " + test3);
		String test4 = h3.handleFeeRequest("����", 700);
		System.out.println("test4 = " + test4);
		System.out.println("---------------------------------------");

		String test5 = h3.handleFeeRequest("����", 1500);
		System.out.println("test5 = " + test5);
		String test6 = h3.handleFeeRequest("����", 1500);
		System.out.println("test6 = " + test6);
	}

	@Test
	/**
	 * ����ģʽ
	 */
	public void testcommand() {
		// ���������
		Tv myTv = new Tv();
		// ��������
		CommandOn on = new CommandOn(myTv);
		// �ػ�����
		CommandOff off = new CommandOff(myTv);
		// Ƶ���л�����
		CommandChange channel = new CommandChange(myTv, 2);
		// ������ƶ���
		Control control = new Control(on, off, channel);

		// ����
		control.turnOn();
		// �л�Ƶ��
		control.changeChannel();
		// �ػ�
		control.turnOff();
	}

	@Test
	/**
	 * ������ģʽ
	 */
	public void testinterpreter() {
		String expStr = "a+b-c+d";
		HashMap<String, Integer> var = new HashMap<String, Integer>();
		var.put("a", 1);
		var.put("b", 2);
		var.put("c", 2);
		var.put("d", 4);

		Context context = new Context();
		// �Ƚ���������ʽ
		context.analyse(expStr);
		// ��������
		System.out.println(context.run(var));
	}

	@Test
	/**
	 * ������ģʽ
	 */
	public void testiterator() {

	}
}
