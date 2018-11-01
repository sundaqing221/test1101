package LIANXI;

public class 数组 {
	public static void main(String[] args) {
		/*
		 * public String(char[] value)
		 * char是字符只能存储一个字符  string是字符串可以存储多个字符
		 */
		String []ch1={"没","有","爱","过","你"};//定义数组 ： ch1【0】 ch1【1】ch1【2】
		System.out.println(ch1.length);//数组长度 
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
		String x="最爱是自己";
		System.out.println("_______________");
		int xx=x.length();
        String[] arg=new String[xx];//定义一个String数组
        String[] s=x.split("");//提取字符串至数组
		for(int i=0;i<arg.length;i++) 
		{
			arg[i]=s[i];
			System.out.println("      "+arg[i]);
		}
		
	}
}
