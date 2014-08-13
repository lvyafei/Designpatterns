23种设计模式
=====

创建范例
-----

创建范例全部是关于如何创建实例的。这组范例可以被划分为两组：类创建范例及对象创建范例。类创建实例在实例化过程中有效的使用类之间的继承关系，对象创建范例则使用代理来完成其任务

> ### 抽象工厂（Abstact Factory）
> ### 构造器(Builder Pattern)
> ### 工厂方法(Factory Method pattern)
> ### 原型(Prototype pattern)
> ### 单例模式(Singleton pattern)


结构范例
-----

这组范例都是关于类及对象复合关系的。

> ### 适配器(Adapter pattern)
> ### 桥接(Bridge pattern)
> ### 组合(Composite pattern)
> ### 装饰(Decorator pattern)
> ### 外观(Façade pattern)
> ### 享元(Flyweight pattern)
> ### 代理(Proxy pattern)

行为范例
-----

这组范例都是关于对象之间如何通讯的。

> ### 职责链(Chain-of-responsibility pattern)
> ### 命令(Command pattern)
> ### 翻译器(Interpreter pattern)
> ### 迭代器(Iterator pattern)
> ### 仲裁器(Mediator pattern)
> ### 回忆(Memento pattern)
> ### 观察者(Observer pattern)
> ### 状态机(State pattern)
> ### 策略(Strategy pattern)
> ### 模板方法(Template method pattern)
> ### 参观者(Visitor)


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
1.[点击这里你可以链接到www.google.com](http://www.google.com)<br />

###只是显示图片
![github](http://github.com/unicorn.png "github")

###想点击某个图片进入一个网页,比如我想点击github的icorn然后再进入www.github.com
[![image]](http://www.github.com/)
[image]: http://github.com/github.png "github"

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
