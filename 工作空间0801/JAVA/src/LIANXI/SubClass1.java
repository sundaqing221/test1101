package LIANXI;
/*��̬��*/
class BaseClass1
{
	public int book=6;
	public void base(){
		System.out.println("�������ͨ����");
		
	}
	public void test(){
		System.out.println("���౻���ǵķ���");
	}
}

public class SubClass1 extends BaseClass1
{  
	//���¶���һ��bookʵ��Field ���ظ����book ʵ��Field
	public String book ="������Java EE ��ҵӦ��ʵս ";
	public void test(){
		System.out.println("���า�Ǹ���ķ���");
	}
	public void sub(){
		System.out.println("�������ͨ����");
	}
	public static void main(String[] args) {
		// �������ʱ���ͺ�����ʱ��ȫһ���������ڶ�̬;
		BaseClass1 bc=new BaseClass1();
		//���6;
		System.out.println(bc.book);
		bc.base();
		bc.test();
		SubClass1 sc=new SubClass1();
		System.out.println(sc.book);
		sc.base();
		sc.test();
		sc.sub();
		//�������ʱ���ͺ�����ʱ���Ͳ�һ������̬����
		BaseClass1 ploymophicBc=new SubClass1();
		//���6--�������ʵ��Ǹ���Field,field ���߱���̬�� 
		System.out.println(ploymophicBc.book);
		//������ý�ִ�дӸ���̳е���base ����
		ploymophicBc.base();
		//������ý�ִ�е�ǰ���test����
		ploymophicBc.test();
		//��ΪploymophicBc�ı���ʱ������BaseClass1
		//BaseClass1��û���ṩsub ��������������������ʱ�����
		//ploymophicBc.sub
	}
}
