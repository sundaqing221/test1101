

	//void  无返回值 
//	快捷键：
//	win+f2     快速重命名
//	ctrl+/  快速注释   
//	alt+/   快速拼写  能力有限，只能写到这个样子
/*	顾名思义，类，就是一类事物的抽象。所以说类就是一个模板，不能做任何实际的工作。但是类可以产生一个个功能相似的实体，就是对象，它们根据同一个类构造，具有实际的行为，就是方法。
	举个例子，人，是一个类。打酱油，是人的一个动作， 也就是方法。小红是人的一个对象。让小红去打酱油，就是调用了人的 “打酱油” 方法。
	上述例子对应的java 是:*/
	// 类
	public class ren {
	public void 打酱油(String name) {
	System.out.println("让"+name+"去打酱油了，呵呵^_^");
	}
	public static void main(String[] args) {
	// 对象
    String  name="小明";
	ren xiaoming = new ren();
	// 调用方法 （叫小明去打酱油，呵呵^_^）
	xiaoming.打酱油(name);
	}
	}

