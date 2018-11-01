package t0829;

public class t2 {		
	public static void main(String[] args) {		    
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
//			System.out.println("存在"+(zz+1)+"个方案");
			}
}
	 
