package MOBAN;


import java.util.Scanner;
import java.util.Arrays;

@SuppressWarnings("all")
/*ȡ������ ��������ǰ*/
public class kkk{
	
	public static void main(String[] args) {
		/*
		 * ������һ�ַ��������������£�
String s1="1223,334,3112,-2134,1124,1243,2143,1243,124,129,401,25,38";
ע���ַ������֣����ּ��ö��Ÿ���
Ҫ��
����ת�����ַ�������
����ת�����������ַ���
�����ִ�С����
�����ִ�С������ɴ�С��
��������������ֵ����Сֵ����ͣ�ƽ��ֵ
������Ϸ��
�ڼ���������һ����������������������������ʾ����������ˡ���������ʾ����лл�㡱

		 */
	     int a;
		//�ַ������� s1="1223,334,3112,-2134,1124,1243,2143,1243,124,129,401,25,38";
		String s1="1223,334,3112,-2134,1124,1243,2143,1243,124,129,401,25,38";
		//����ת�����ַ�������
		String[]st=s1.split(",");
		//����ת�����������ַ���
		int[]ai=new int[st.length];
		for(int i=0;i<ai.length;i++){
			ai[i]=Integer.parseInt(st[i]);			
		}
		//�����ְ���С����
		Arrays.sort(ai);
		//�����ִ�С������ɴ�С��
		for(int i=ai.length-1;i>=0;i--){
			System.out.print(ai[i]+" ");
		}
		System.out.println();
		System.out.println("max="+ai[ai.length-1]);
		System.out.println("min="+ai[0]);
		int sum=0;
		double avg;
		for(int i=0;i<ai.length;i++){
			sum+=ai[i];
		}
		System.out.println("sum="+sum);
		avg=1.0*sum/ai.length;
		System.out.println("avg="+avg);
		
		for(int i=1;i<3;i++) {
			Scanner input=new Scanner(System.in);
			System.out.println("���������");
			int key=input.nextInt();
			int index=Arrays.binarySearch(ai, key);
			if(index>=0){
				System.out.println("������ˣ�");
				System.out.println(i);
				i=2;
			}
			else {
				System.out.println("�׳գ�"
						+ " �ٲ�һ��");
				i=1;
			}
			System.out.println(i);
		}	
	}	
}
