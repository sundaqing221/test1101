package t0829;

public class t2 {		
	public static void main(String[] args) {		    
		    int x,y,z;
			double b;
			int zz=1;
			String[] gg=new String[zz];
			/*��������С��
			 * ��������С��ϼ�kͷ
			 * �����װ��3�����
			 * �����װ��2�����
			 * С���װ��0.5�����
			 * ���ܹ�װ��s�����ʱ������С��ֱ���Ҫ����ͷ��
			 * */
			for(x=0;x<=90;x++)
			{
				for(y=0;y<=90-x;y++) 
				{   
					for(z=0;z<=90-y-x;z++) 
					{
						b=Math.abs(3*x+2*y+0.5*z-90);
						if(b<=0.001&&x+y+z==90) 
						{	
							zz=zz+1;
							System.out.println(zz);
							System.out.println(x+" "+y+" "+z);
							gg[0]=x+" "+y+" "+z;													    		 
						}
					}	
				}
			}
//			System.out.println("����"+(zz+1)+"������");
			}
}
	 
