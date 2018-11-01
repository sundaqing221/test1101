package t0829;

public class mianshiti {		
	 String[] ma (int k,int s) {		    
		    int x,y,z;
			double b;
			int zz=1;
			String[] gg=new String[zz];
			/*大马，中马，小马
			 * 大马中马小马合计k头
			 * 大马可装载3斤货物
			 * 中马可装载2斤货物
			 * 小马可装载0.5斤货物
			 * 问总共装载s斤货物时，大中小马分别需要多少头？
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
			System.out.println("存在"+(zz+1)+"个方案");
			return gg;			
			}
	 
	 public static void main(String[] args){
		 mianshiti ss=new mianshiti();
		 ss.ma(90, 90);
		 // 输出结果  ：大中小马各有多少头！以数组形式输出
		 // 任务完成 
	 }	 
	}
	

