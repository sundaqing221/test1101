package LIANXI;

import java.util.Arrays;

public class 数组排序 {
	public static void main(String[] args) {
		int[] int1=new int[7];	
		String key2="7845136";
		String[] s1=new String[7];
		s1=key2.split("");
		for(int i=0;i<=6;i++
				)
		{
/*			System.out.println(s1[i]);*/
			int1[i]=Integer.parseInt(s1[i]);
		}
		
		Arrays.sort(int1);
		//数组排序  从小到大
		for(int i=0;i<=6;i++
				) 
		{			
			System.out.println(int1[i]);			
		}		
	}
	
	
	


}
