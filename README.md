23种设计模式
=====

创建范例
-----

创建范例全部是关于如何创建实例的。这组范例可以被划分为两组：类创建范例及对象创建范例。类创建实例在实例化过程中有效的使用类之间的继承关系，对象创建范例则使用代理来完成其任务

> ### [抽象工厂（Abstact Factory）](http://blog.csdn.net/zhengzhb/article/details/7359385)
> ### [构造器(Builder Pattern)](http://blog.csdn.net/luhuajcdd/article/details/8806897)
> ### [工厂方法(Factory Method pattern)](http://www.cnblogs.com/java-my-life/archive/2012/03/25/2416227.html)
> ### [原型(Prototype pattern)](http://blog.csdn.net/zhengzhb/article/details/7393528)
> ### [单例模式(Singleton pattern)](http://yangguangfu.iteye.com/blog/815944)


[结构范例](http://www.cnblogs.com/Terrylee/archive/2006/06/01/designpattern_articles_structpattern.html)
-----

这组范例都是关于类及对象复合关系的。

> ### [适配器(Adapter pattern)](http://www.cnblogs.com/wangjq/archive/2012/07/09/2582485.html)
> ### [桥接(Bridge pattern)](http://www.cnblogs.com/muzongyan/archive/2010/09/01/1815153.html)
> ### [组合(Composite pattern)](http://www.cnblogs.com/doubleliang/archive/2011/12/27/2304104.html)
> ### [装饰(Decorator pattern)](http://www.cnblogs.com/god_bless_you/archive/2010/06/10/1755212.html)
> ### [外观(Façade pattern)](http://www.cnblogs.com/Terrylee/archive/2006/03/17/352349.html)
> ### [享元(Flyweight pattern)](http://www.cnblogs.com/zhenyulu/articles/55793.html)
> ### [代理(Proxy pattern)](http://www.cnblogs.com/Terrylee/archive/2006/05/18/403382.html)

行为范例
-----

这组范例都是关于对象之间如何通讯的。

> ### [职责链(Chain-of-responsibility pattern)](http://www.cnblogs.com/java-my-life/archive/2012/05/28/2516865.html)
> ### [命令(Command pattern)](http://www.cnblogs.com/devinzhang/archive/2012/01/06/2315235.html)
> ### [翻译器(Interpreter pattern)](http://wangwengcn.iteye.com/blog/1733971)
> ### [迭代器(Iterator pattern)](http://www.cnblogs.com/liuling/archive/2013/04/14/iterator.html)
> ### [仲裁器(Mediator pattern)](http://www.cnblogs.com/BeyondAnyTime/archive/2012/08/30/2663922.html)
> ### [回忆(Memento pattern)](http://www.cnblogs.com/java-my-life/archive/2012/06/06/2534942.html)
> ### [观察者(Observer pattern)](http://www.cnblogs.com/wangjq/archive/2012/07/12/2587966.html)
> ### [状态机(State pattern)](http://www.cnblogs.com/java-my-life/archive/2012/06/08/2538146.html)
> ### [策略(Strategy pattern)](http://yangguangfu.iteye.com/blog/815107)
> ### [模板方法(Template method pattern)](http://www.cnblogs.com/java-my-life/archive/2012/05/14/2495235.html)
> ### [参观者(Visitor)](http://dev.yesky.com/82/2036582.shtml)

设计模式六大原则
=====
> ### [单一职责原则](http://blog.csdn.net/zhengzhb/article/details/7278174)
> ### [里氏替换原则](http://blog.csdn.net/zhengzhb/article/details/7281833)
> ### [依赖倒置原则](http://blog.csdn.net/zhengzhb/article/details/7289269)
> ### [接口隔离原则](http://blog.csdn.net/zhengzhb/article/details/7296921)
> ### [迪米特法则](http://blog.csdn.net/zhengzhb/article/details/7296930)
> ### [开闭原则](http://blog.csdn.net/zhengzhb/article/details/7296944)

-----------------------------Readme.md编辑指南------------------------------------------
大标题
===================================
  大标题一般显示工程名,类似html的\<h1\><br />
  你只要在标题下面跟上=====即可

  
中标题
-----------------------------------
  中标题一般显示重点项,类似html的\<h2\><br />
  你只要在标题下面输入------即可
  
### 小标题
  小标题类似html的\<h3\><br />
  小标题的格式如下 ### 小标题<br />
  注意#和标题字符中间要有空格

### 注意!!!下面所有语法的提示我都先用小标题提醒了!!! 

### 单行文本框
    这是一个单行的文本框,只要两个Tab再输入文字即可
        
### 多行文本框  
    这是一个有多行的文本框
    你可以写入代码等,每行文字只要输入两个Tab再输入文字即可
    这里你可以输入一段代码

### 比如我们可以在多行文本框里输入一段代码,来一个Java版本的HelloWorld吧
    public class HelloWorld {

      /**
      * @param args
   */
   public static void main(String[] args) {
   System.out.println("HelloWorld!");

   }

    }
### 链接
1.[点击这里你可以链接到我的这个项目](https://github.com/lvyafei/Designpatterns)<br />

###只是显示图片
![github](https://avatars2.githubusercontent.com/u/6541847?v=2 "github")

###想点击某个图片进入一个网页,比如我想点击github的icorn然后再进入www.github.com
[![image]](http://www.github.com/)
[image]: https://avatars0.githubusercontent.com/u/9919?v=2 "github"

### 文字被些字符包围
> 文字被些字符包围
>
> 只要再文字前面加上>空格即可
>
> 如果你要换行的话,新起一行,输入>空格即可,后面不接文字
> 但> 只能放在行首才有效

### 文字被些字符包围,多重包围
> 文字被些字符包围开始
>
> > 只要再文字前面加上>空格即可
>
>  > > 如果你要换行的话,新起一行,输入>空格即可,后面不接文字
>
> > > > 但> 只能放在行首才有效

### 特殊字符处理
有一些特殊字符如<,#等,只要在特殊字符前面加上转义字符\即可<br />
你想换行的话其实可以直接用html标签\<br /\>
