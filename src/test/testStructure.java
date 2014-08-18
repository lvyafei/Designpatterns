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
	 * 桥接模式
	 */
	public void Testbridge() {
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
	 * 适配器模式
	 */
	public void Testadapter() {
		Target target = new Adapter();
		target.Request();
	}

	@Test
	/**
	 *代理模式
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
	 * 外观模式
	 */
	public void Testfacade() {
		// 外观
		Mortgage mortgage = new Mortgage();
		Customer customer = new Customer("Ann McKinsey");
		Boolean eligable = mortgage.IsEligible(customer, 125000);
		System.out.println("\n" + customer.getName() + " has been "
				+ (eligable ? "Approved" : "Rejected"));
	}

	@Test
	/**
	 * 组合模式
	 */
	public void Testcomposite() {
		StoreOrBranch store = new StoreOrBranch("朝阳总店");
		StoreOrBranch brach = new StoreOrBranch("东城分店");
		JoinInStore jstore = new JoinInStore("海淀加盟店一");
		JoinInStore jstore1 = new JoinInStore("上地加盟店二");

		brach.Add(jstore);
		brach.Add(jstore1);
		store.Add(brach);

		store.PayByCard();
	}

	private static FlavorFactory flavorFactory;
	private static int ordersMade = 0;

	@Test
	/**
	 * 享元模式
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
		// 将咖啡卖给客人
		o.Serve(new Table(++ordersMade));
	}

	@Test
	/**
	 * 责任链模式
	 */
	public void testresponsibility() {
		// 先要组装责任链
		Handler h1 = new GeneralManager();
		Handler h2 = new DeptManager();
		Handler h3 = new ProjectManager();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);

		// 开始测试
		String test1 = h3.handleFeeRequest("张三", 300);
		System.out.println("test1 = " + test1);
		String test2 = h3.handleFeeRequest("李四", 300);
		System.out.println("test2 = " + test2);
		System.out.println("---------------------------------------");

		String test3 = h3.handleFeeRequest("张三", 700);
		System.out.println("test3 = " + test3);
		String test4 = h3.handleFeeRequest("李四", 700);
		System.out.println("test4 = " + test4);
		System.out.println("---------------------------------------");

		String test5 = h3.handleFeeRequest("张三", 1500);
		System.out.println("test5 = " + test5);
		String test6 = h3.handleFeeRequest("李四", 1500);
		System.out.println("test6 = " + test6);
	}

	@Test
	/**
	 * 命令模式
	 */
	public void testcommand() {
		// 命令接收者
		Tv myTv = new Tv();
		// 开机命令
		CommandOn on = new CommandOn(myTv);
		// 关机命令
		CommandOff off = new CommandOff(myTv);
		// 频道切换命令
		CommandChange channel = new CommandChange(myTv, 2);
		// 命令控制对象
		Control control = new Control(on, off, channel);

		// 开机
		control.turnOn();
		// 切换频道
		control.changeChannel();
		// 关机
		control.turnOff();
	}

	@Test
	/**
	 * 解析器模式
	 */
	public void testinterpreter() {
		String expStr = "a+b-c+d";
		HashMap<String, Integer> var = new HashMap<String, Integer>();
		var.put("a", 1);
		var.put("b", 2);
		var.put("c", 2);
		var.put("d", 4);

		Context context = new Context();
		// 先解析运算表达式
		context.analyse(expStr);
		// 进行运算
		System.out.println(context.run(var));
	}

	@Test
	/**
	 * 迭代器模式
	 */
	public void testiterator() {

	}
}
