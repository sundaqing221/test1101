package LIANXI;

public class Person {
	private String name;
	private int age;
	private int weight;
	//private static int eye=2;	
	public void setAge(int age){
		if (age>0 && age<120){
			this.age=age;
		}
		else 
			System.out.println("age is error");
	}
	public int getAge(){
		return this.age;
	}
	public void setName(String name){
		if ((name.length())>=2 && (name.length()<=10)){
			this.name=name;
		}
	}
	public String getName(){
		return this.name;
	}
	public void setWeight (int weight){
		if (weight>=2 && weight<=200){
			this.weight=weight;
		}
		else 			
			System.out.println("weight is error");
	}
	public int getWeight (){		
		return this.weight;
	}
	
public Person()
{

}
public Person(String name,int age){
	// System.out.println(name+age);
	setName(name);
	setAge(age);
}
public Person(String name,int age,int weight){
	//setName(name);	
	this(name,age);//必须在第一条语句
	//setAge(age);
	setWeight(weight);
}
/* public Person(String name,int age,int weight)
{
	this(name,age);
	this.weight=weight;
	// System.out.println("name:"+name+"age:"+age+"weight"+weight);
	 
}
*/
public void tell(){
	System.out.println(this.name+this.age+this.weight);
}

	public static void main(String[] args) {
		Person p1=new Person();	
		//p1.setAge(555);
		p1.setAge(35);
		p1.setName("张三");
		p1.setWeight(55);
		p1.tell();
		System.out.println("My name is "+p1.getName()+"年龄"+p1.getAge()+"weight"+p1.weight);
		Person p2=new Person("李四",55);
		System.out.println("My name is "+p2.getName()+"年龄"+p2.getAge());
		Person p3=new Person("王五",18,56);
		System.out.println("My name is "+p3.getName()+"年龄"+p3.getAge()+"体重"+p3.weight);
		p3.tell();		

	}
}