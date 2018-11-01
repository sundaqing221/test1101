package LIANXI;
/*多态：*/
class BaseClass1
{
	public int book=6;
	public void base(){
		System.out.println("父类的普通方法");
		
	}
	public void test(){
		System.out.println("父类被覆盖的方法");
	}
}

public class SubClass1 extends BaseClass1
{  
	//重新定义一个book实例Field 隐藏父类的book 实例Field
	public String book ="轻量级Java EE 企业应用实战 ";
	public void test(){
		System.out.println("子类覆盖父类的方法");
	}
	public void sub(){
		System.out.println("子类的普通方法");
	}
	public static void main(String[] args) {
		// 下面编译时类型和运行时完全一样，不存在多态;
		BaseClass1 bc=new BaseClass1();
		//输出6;
		System.out.println(bc.book);
		bc.base();
		bc.test();
		SubClass1 sc=new SubClass1();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		sc.sub();
		//下面编译时类型和运行时类型不一样，多态发生
		BaseClass1 ploymophicBc=new SubClass1();
		//输出6--表明访问的是父类Field,field 不具备多态性 
		System.out.println(ploymophicBc.book);
		//下面调用将执行从父类继承到的base 方法
		ploymophicBc.base();
		//下面调用将执行当前类的test方法
		ploymophicBc.test();
		//因为ploymophicBc的编译时类型是BaseClass1
		//BaseClass1类没有提供sub 方法，所以下面代码编译时会出错；
		//ploymophicBc.sub
	}
}
