package LIANXI;

public class ���� {
	public static void main(String[] args) {
		/*
		 * public String(char[] value)
		 * char���ַ�ֻ�ܴ洢һ���ַ�  string���ַ������Դ洢����ַ�
		 */
		String []ch1={"û","��","��","��","��"};//�������� �� ch1��0�� ch1��1��ch1��2��
		System.out.println(ch1.length);//���鳤�� 
		String key;
		key="";
		for(int i=0;i<=ch1.length-1;i++) {
			key=key+ch1[i];
			if(i==ch1.length-1
					) 
			{
				System.out.println(key);		
			}
		}
		String x="����Լ�";
		System.out.println("_______________");
		int xx=x.length();
        String[] arg=new String[xx];//����һ��String����
        String[] s=x.split("");//��ȡ�ַ���������
		for(int i=0;i<arg.length;i++) 
		{
			arg[i]=s[i];
			System.out.println("      "+arg[i]);
		}
		
	}
}
