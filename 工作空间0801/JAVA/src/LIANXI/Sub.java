package LIANXI;

/*���ø��๹����*/
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
/*���๹����ִ����ĵ�һ��ʹ��super��ʽ���ø��๹������ϵͳ������super �����ﴫ��ʵ���б���ø����Ӧ�Ĺ�����
���๹����ִ�����û��super����Ҳû��this ���ã�ϵͳ������ִ�����๹����֮ǰ����ʽ���ø����޲����Ĺ�����

����ִ�е�����java.lang.Object��Ĺ�����*/

