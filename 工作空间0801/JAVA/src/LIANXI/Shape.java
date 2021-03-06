package LIANXI;
public abstract class Shape {
	{
		System.out.println("执行shape 的初始化块...");
	}
	private String color;
	//定义一个计算周长的抽象方法
	public abstract double calPerimeter();
	//定义一个返回形状的抽象方法
	public abstract String getType();
	//定义Shape 的构造器，该构造器并不是用于创建Shape对象
	//而是用于被子类调用
	public Shape(){}
	public Shape(String color)
	{
		System.out.println("执行Shape 的构造器...");
		this.color=color;		
	}
	//省略color 属性的setter 和getter 方法
	public String getColor(){
		return this.color;
	}
}