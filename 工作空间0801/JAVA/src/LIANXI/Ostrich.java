package LIANXI;

public class Ostrich extends Bird {
	public void fly(){
		System.out.println("我只能在地上奔跑");
		//super.fly();
	}
	public static void main(String[] args) {
		Ostrich os=new Ostrich();
		os.fly();//子类修改父类内容  执行子类的内容  子类可继承父类的方法并修改
		Bird bird=new Bird();
		bird.fly();	
	}	
}
