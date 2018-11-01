package LIANXI;

/*调用父类构造器*/
class Base
{
	public double size;
	public String name;	

public Base(double size, String name){
	this.size=size;
	this.name=name;
 }
}
  public class Sub extends Base
{
	public String color;
	public Sub(double size, String name, String color)
	{
		super(size, name);
		this.color=color;		
}

	public static void main(String[] args) {
		Sub s=new Sub(5.6,"testObject","red");
		System.out.println(s.size+"__"+s.name+"__"+s.color);

	}

}
/*子类构造器执行体的第一行使用super显式调用父类构造器，系统将根据super 调用里传入实参列表调用父类对应的构造器
子类构造器执行体既没有super调用也没有this 调用，系统将会在执行子类构造器之前，隐式调用父类无参数的构造器

最先执行的总是java.lang.Object类的构造器*/

