package t0829;

public class mianshiti {		
	 String[] ma (int k,int s) {		    
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
			for(x=0;x<=s;x++)
			{
				for(y=0;y<=s-x;y++) 
				{
					for(z=0;z<=s-y-x;z++) 
					{
						b=Math.abs(3*x+2*y+0.5*z-s);
						if(b<=0.001&&x+y+z==k) 
						{	
							if
							(b==1) 
							{
								gg[zz-1]=(x+" "+y+" "+z);
							}
							else if(b>1)
							{
								zz++;
								gg[zz-1]=(x+" "+y+" "+z);
							}
																				    		 
						}
					}	
				}
			}
			System.out.println("����"+(zz+1)+"������");
			return gg;			
			}
	 
	 public static void main(String[] args){
		 mianshiti ss=new mianshiti();
		 ss.ma(90, 90);
		 // ������  ������С����ж���ͷ����������ʽ���
		 // ������� 
	 }	 
	}
	

