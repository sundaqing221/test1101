package LIANXI;

class Creature
{
	public Creature()
	{
		System.out.println("Creature �޲����Ĺ�����");
	}
}
class Animal extends Creature
{
	public Animal (String name)
	{
		System.out.println("Animal ��һ�������Ĺ�����,"+"�ö����name Ϊ"+name);
	}
	public Animal (String name,int age){
		//ʹ��this ����ͬһ�����صĹ�����
		this(name);
		System.out.println("Animal ��2�������Ĺ�����"+"��age Ϊ"+age);
	}
}
public class Wolf extends Animal{
	public Wolf()
	{
		//��ʾ���ø�����2�������Ĺ�����
		super("��̫��",3);
		System.out.println("wolf �޲����Ĺ�����");
	}

	public static void main(String[] args) {
		new Wolf();

	}

}
