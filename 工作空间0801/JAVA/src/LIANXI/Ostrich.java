package LIANXI;

public class Ostrich extends Bird {
	public void fly(){
		System.out.println("��ֻ���ڵ��ϱ���");
		//super.fly();
	}
	public static void main(String[] args) {
		Ostrich os=new Ostrich();
		os.fly();//�����޸ĸ�������  ִ�����������  ����ɼ̳и���ķ������޸�
		Bird bird=new Bird();
		bird.fly();	
	}	
}
