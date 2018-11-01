package MOBAN;


import java.util.Scanner;
import java.util.Arrays;

@SuppressWarnings("all")
/*取消警告 放在类名前*/
public class kkk{
	
	public static void main(String[] args) {
		/*
		 * 假设有一字符串变量定义如下：
String s1="1223,334,3112,-2134,1124,1243,2143,1243,124,129,401,25,38";
注：字符串数字，数字间用逗号隔开
要求
将其转换成字符串数组
将其转换成数字型字符串
按数字大小排序
按数字大小输出（由大到小）
求出该数组中最大值，最小值，求和，平均值
猜数游戏：
在键盘中输入一个猜数，当该数在上述数组中显示：“你猜中了”，否则显示：“谢谢你”

		 */
	     int a;
		//字符串定义 s1="1223,334,3112,-2134,1124,1243,2143,1243,124,129,401,25,38";
		String s1="1223,334,3112,-2134,1124,1243,2143,1243,124,129,401,25,38";
		//将其转换成字符串数组
		String[]st=s1.split(",");
		//将其转换成数字型字符串
		int[]ai=new int[st.length];
		for(int i=0;i<ai.length;i++){
			ai[i]=Integer.parseInt(st[i]);			
		}
		//按数字按大小排序
		Arrays.sort(ai);
		//按数字大小输出（由大到小）
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
			System.out.println("请输入猜数");
			int key=input.nextInt();
			int index=Arrays.binarySearch(ai, key);
			if(index>=0){
				System.out.println("你猜中了！");
				System.out.println(i);
				i=2;
			}
			else {
				System.out.println("白痴！"
						+ " 再猜一遍");
				i=1;
			}
			System.out.println(i);
		}	
	}	
}
