package test;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import createType.abstactfactoryPattern.Factory;
import createType.abstactfactoryPattern.IFactory;
import createType.builderPattern.BMWBuilder;
import createType.builderPattern.BenzBuilder;
import createType.builderPattern.Car;
import createType.builderPattern.Director;
import createType.factoryPattern.ExportFactory;
import createType.factoryPattern.ExportFile;
import createType.factoryPattern.ExportHtmlFactory;
import createType.prototypePattern.ConcretePrototype;
import createType.singletonPattern.Emperor;
import createType.singletonPattern.EmperorNew;
import behavioralType.commandPattern.CommandChange;
import behavioralType.commandPattern.CommandOff;
import behavioralType.commandPattern.CommandOn;
import behavioralType.commandPattern.Control;
import behavioralType.commandPattern.Tv;
import behavioralType.interpreterPattern.Context;
import behavioralType.iteratorPattern.RenMinMony;
import behavioralType.mediatorPattern.Monitor;
import behavioralType.mediatorPattern.QQMediator;
import behavioralType.mediatorPattern.StudentA;
import behavioralType.mediatorPattern.StudentB;
import behavioralType.mediatorPattern.TuanZhiShu;
import behavioralType.mementoPattern.MementoIF;
import behavioralType.mementoPattern.Originator;
import behavioralType.observerPattern.Accountant;
import behavioralType.observerPattern.Cashier;
import behavioralType.observerPattern.Dilliveryman;
import behavioralType.responsibilityPattern.DeptManager;
import behavioralType.responsibilityPattern.GeneralManager;
import behavioralType.responsibilityPattern.Handler;
import behavioralType.responsibilityPattern.ProjectManager;
import behavioralType.statePattern.VoteManager;
import behavioralType.strategyPattern.BackDoor;
import behavioralType.strategyPattern.BlackEnemy;
import behavioralType.strategyPattern.GivenGreenLight;
import behavioralType.templatePattern.Account;
import behavioralType.templatePattern.CDAccount;
import behavioralType.templatePattern.MoneyMarketAccount;
import behavioralType.visitorPattern.BeeAndFlowers;
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
	 * 单例模式
	 */
	public void testsingleton(){
		//第一天  
        Emperor  emperor1 = Emperor.getInstance();  
        //第一天见的皇帝叫什么名字呢？  
        emperor1.emperorInfo();  
        //第二天  
        Emperor  emperor2 = Emperor.getInstance();  
        //第二天见的皇帝叫什么名字呢？  
        emperor2.emperorInfo();  
        //第三天  
        Emperor  emperor3 = Emperor.getInstance();  
        //第三天见的皇帝叫什么名字呢？  
        emperor3.emperorInfo();     
        //三天见的皇帝都是同一个人，荣幸吧，呵呵。  
        System.out.println("==============");
        EmperorNew.emperorInfo();
	}
	@Test
	/**
	 * 工厂模式
	 */
	public void testfactory(){
		 String data = "";
	     ExportFactory exportFactory = new ExportHtmlFactory();
	     ExportFile ef = exportFactory.factory("financial");
	     ef.export(data);
	}
	@Test
	/**
	 * 原型模式
	 */
	public void testprototype() throws CloneNotSupportedException{
		ConcretePrototype cp = new ConcretePrototype();  
        for(int i=0; i< 10; i++){  
            ConcretePrototype clonecp = (ConcretePrototype)cp.clone();  
            clonecp.show();  
        }  
	}
	@Test
	/**
	 * 抽象工厂
	 */
	public void testabstractfactory(){
		 IFactory factory = new Factory();  
	     factory.createProduct1().show();  
	     factory.createProduct2().show();  
	}
	@Test
	/**
	 * 构造器模式
	 */
	public void testbuilder(){
		BenzBuilder benzBuilder = new BenzBuilder() ;  
        BMWBuilder bmwBuilder = new BMWBuilder() ;  
          
        Director benzDirector = new Director(benzBuilder) ;  
        benzDirector.getCarTogether() ;  
        Car benz = benzBuilder.getCar() ;  
        benz.run() ;  
        System.out.println("----------------------------");  
        Director bmwDirector = new Director(bmwBuilder) ;  
        bmwDirector.getCarTogether() ;  
        Car bmw = bmwBuilder.getCar() ;  
        bmw.run() ;  
	}
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
		int n = 20;
	    int sum = 0;
        Collection<RenMinMony> set = new HashSet<RenMinMony>();//集合对象
        for(int i=1;i<=n;i++){
            if(i==n/2 || i==n/5 || i==n/6){
                set.add(new RenMinMony(100,false));
            }else{
                set.add(new RenMinMony(100,true));
            }
        }
        Iterator<RenMinMony> iterator = set.iterator();
      
        System.out.println("保险箱共有"+set.size()+"张人民币！");
        int k = 0;
        while(iterator.hasNext()){
            RenMinMony money = iterator.next();
            k++;
            if(money.isTure() == false){
                System.out.println("第"+k+"张是假币，被销毁");
                iterator.remove();//移除掉最近一次本next()返回的对象
                k++;
            }
        }
        System.out.println("保险箱现有真人民币"+set.size()+"张，总价值是：");
        iterator = set.iterator();
        while(iterator.hasNext()){
            RenMinMony money = iterator.next();
            sum = sum + money.getValue();
        }
        System.out.println(sum+"元");     
	}
	@Test
	/**
	 * 状态模式
	 */
	public void teststate(){
		VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
	}
	@Test
	/**
	 * 中介者模式
	 */
	public void testmediator(){
		QQMediator qq = new QQMediator();
		Monitor studentMonitor=new Monitor();
		studentMonitor.setName("Vincent");
		TuanZhiShu studentTuanZhiShu=new TuanZhiShu();
		studentTuanZhiShu.setName("Robort");
		StudentA studentA=new StudentA();
		studentA.setName("Sam");
		StudentB studentB=new StudentB();
		studentB.setName("Tom");
	    /*----------------------班长发通知-----------------------------*/
		System.out.println("下面的班长发布一个通知的场景：");
	    //将同学们加入到qq群中
		qq.add_student(studentMonitor);
		qq.add_student(studentTuanZhiShu);
		qq.add_student(studentA);
		qq.add_student(studentB);
		//设置大家的回复信息
		studentMonitor.setContent("明天下午2点开年级会，收到回复^^。");
		studentTuanZhiShu.setContent("知道了，肯定到!!");
		studentA.setContent("收到了，但是可能晚点到!!");
		studentB.setContent("收到了，但是明天要去面试!!");
		//开始发通知
		qq.notify(studentMonitor);
		/*--------------------两个同学私下交流--------------------------*/
		System.out.println("下面是两个同学的私下交流：");
		studentMonitor.setContent("你觉得咱们“软件项目管理老师”讲的怎么样？");
		studentA.setContent("我觉得讲的不够生动，还点名，不太好!!!");
		qq.chart(studentMonitor,studentA);
	}
	@Test
	/**
	 * 备忘录模式
	 */
	public void testmemento(){
		Originator o = new Originator();
        //修改状态
        o.changeState("state 0");
        //创建备忘录
        MementoIF memento = o.createMemento();
        //修改状态
        o.changeState("state 1");
        //按照备忘录恢复对象的状态
        o.restoreMemento(memento);
	}
	@Test
	/**
	 * 观察者模式
	 */
	public void testobserver(){
		 behavioralType.observerPattern.Customer subject =new behavioralType.observerPattern.Customer();

         subject.Attach(new Accountant(subject));
         subject.Attach(new Cashier(subject));
         subject.Attach(new Dilliveryman(subject));

         subject.setCustomerState("已付款");
         subject.Notify();
	}
	@Test
	/**
	 * 策略模式
	 */
	public void teststrategy(){
	    behavioralType.strategyPattern.Context context;  
        //刚到吴国的时候拆开第一个  
        System.out.println("----------刚刚到吴国的时候拆开第一个---------------");  
        context = new behavioralType.strategyPattern.Context(new BackDoor());  
        context.operate();//拆开执行  
          
        //当刘备乐不思蜀时，拆开第二个  
        System.out.println("----------刘备乐不思蜀，拆第二个了---------------");  
        context = new behavioralType.strategyPattern.Context(new GivenGreenLight());  
        context.operate();//拆开执行  
          
        //孙权的小追兵了，咋办？拆开第三个锦囊  
        System.out.println("----------孙权的小追兵了，咋办？拆开第三个锦囊---------------");  
        context = new behavioralType.strategyPattern.Context(new BlackEnemy());  
        context.operate();//拆开执行  
	}
	@Test
	/**
	 * 模板方法模式
	 */
	public void testtemplate(){
		 Account account = new MoneyMarketAccount();
	     System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
	     account = new CDAccount();
	     System.out.println("定期账号的利息数额为：" + account.calculateInterest());
	}
	@Test
	/**
	 * 访问者模式
	 */
	public void testvisitor(){
		BeeAndFlowers beeandflower=new BeeAndFlowers();
		beeandflower.test();
	}
}
