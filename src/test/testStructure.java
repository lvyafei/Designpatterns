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
	 * ����ģʽ
	 */
	public void testsingleton(){
		//��һ��  
        Emperor  emperor1 = Emperor.getInstance();  
        //��һ����Ļʵ۽�ʲô�����أ�  
        emperor1.emperorInfo();  
        //�ڶ���  
        Emperor  emperor2 = Emperor.getInstance();  
        //�ڶ�����Ļʵ۽�ʲô�����أ�  
        emperor2.emperorInfo();  
        //������  
        Emperor  emperor3 = Emperor.getInstance();  
        //��������Ļʵ۽�ʲô�����أ�  
        emperor3.emperorInfo();     
        //������Ļʵ۶���ͬһ���ˣ����Ұɣ��Ǻǡ�  
        System.out.println("==============");
        EmperorNew.emperorInfo();
	}
	@Test
	/**
	 * ����ģʽ
	 */
	public void testfactory(){
		 String data = "";
	     ExportFactory exportFactory = new ExportHtmlFactory();
	     ExportFile ef = exportFactory.factory("financial");
	     ef.export(data);
	}
	@Test
	/**
	 * ԭ��ģʽ
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
	 * ���󹤳�
	 */
	public void testabstractfactory(){
		 IFactory factory = new Factory();  
	     factory.createProduct1().show();  
	     factory.createProduct2().show();  
	}
	@Test
	/**
	 * ������ģʽ
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
		int n = 20;
	    int sum = 0;
        Collection<RenMinMony> set = new HashSet<RenMinMony>();//���϶���
        for(int i=1;i<=n;i++){
            if(i==n/2 || i==n/5 || i==n/6){
                set.add(new RenMinMony(100,false));
            }else{
                set.add(new RenMinMony(100,true));
            }
        }
        Iterator<RenMinMony> iterator = set.iterator();
      
        System.out.println("�����乲��"+set.size()+"������ң�");
        int k = 0;
        while(iterator.hasNext()){
            RenMinMony money = iterator.next();
            k++;
            if(money.isTure() == false){
                System.out.println("��"+k+"���Ǽٱң�������");
                iterator.remove();//�Ƴ������һ�α�next()���صĶ���
                k++;
            }
        }
        System.out.println("�����������������"+set.size()+"�ţ��ܼ�ֵ�ǣ�");
        iterator = set.iterator();
        while(iterator.hasNext()){
            RenMinMony money = iterator.next();
            sum = sum + money.getValue();
        }
        System.out.println(sum+"Ԫ");     
	}
	@Test
	/**
	 * ״̬ģʽ
	 */
	public void teststate(){
		VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
	}
	@Test
	/**
	 * �н���ģʽ
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
	    /*----------------------�೤��֪ͨ-----------------------------*/
		System.out.println("����İ೤����һ��֪ͨ�ĳ�����");
	    //��ͬѧ�Ǽ��뵽qqȺ��
		qq.add_student(studentMonitor);
		qq.add_student(studentTuanZhiShu);
		qq.add_student(studentA);
		qq.add_student(studentB);
		//���ô�ҵĻظ���Ϣ
		studentMonitor.setContent("��������2�㿪�꼶�ᣬ�յ��ظ�^^��");
		studentTuanZhiShu.setContent("֪���ˣ��϶���!!");
		studentA.setContent("�յ��ˣ����ǿ�����㵽!!");
		studentB.setContent("�յ��ˣ���������Ҫȥ����!!");
		//��ʼ��֪ͨ
		qq.notify(studentMonitor);
		/*--------------------����ͬѧ˽�½���--------------------------*/
		System.out.println("����������ͬѧ��˽�½�����");
		studentMonitor.setContent("��������ǡ������Ŀ������ʦ��������ô����");
		studentA.setContent("�Ҿ��ý��Ĳ�������������������̫��!!!");
		qq.chart(studentMonitor,studentA);
	}
	@Test
	/**
	 * ����¼ģʽ
	 */
	public void testmemento(){
		Originator o = new Originator();
        //�޸�״̬
        o.changeState("state 0");
        //��������¼
        MementoIF memento = o.createMemento();
        //�޸�״̬
        o.changeState("state 1");
        //���ձ���¼�ָ������״̬
        o.restoreMemento(memento);
	}
	@Test
	/**
	 * �۲���ģʽ
	 */
	public void testobserver(){
		 behavioralType.observerPattern.Customer subject =new behavioralType.observerPattern.Customer();

         subject.Attach(new Accountant(subject));
         subject.Attach(new Cashier(subject));
         subject.Attach(new Dilliveryman(subject));

         subject.setCustomerState("�Ѹ���");
         subject.Notify();
	}
	@Test
	/**
	 * ����ģʽ
	 */
	public void teststrategy(){
	    behavioralType.strategyPattern.Context context;  
        //�յ������ʱ��𿪵�һ��  
        System.out.println("----------�ոյ������ʱ��𿪵�һ��---------------");  
        context = new behavioralType.strategyPattern.Context(new BackDoor());  
        context.operate();//��ִ��  
          
        //�������ֲ�˼��ʱ���𿪵ڶ���  
        System.out.println("----------�����ֲ�˼�񣬲�ڶ�����---------------");  
        context = new behavioralType.strategyPattern.Context(new GivenGreenLight());  
        context.operate();//��ִ��  
          
        //��Ȩ��С׷���ˣ�զ�죿�𿪵���������  
        System.out.println("----------��Ȩ��С׷���ˣ�զ�죿�𿪵���������---------------");  
        context = new behavioralType.strategyPattern.Context(new BlackEnemy());  
        context.operate();//��ִ��  
	}
	@Test
	/**
	 * ģ�巽��ģʽ
	 */
	public void testtemplate(){
		 Account account = new MoneyMarketAccount();
	     System.out.println("�����г��˺ŵ���Ϣ����Ϊ��" + account.calculateInterest());
	     account = new CDAccount();
	     System.out.println("�����˺ŵ���Ϣ����Ϊ��" + account.calculateInterest());
	}
	@Test
	/**
	 * ������ģʽ
	 */
	public void testvisitor(){
		BeeAndFlowers beeandflower=new BeeAndFlowers();
		beeandflower.test();
	}
}
