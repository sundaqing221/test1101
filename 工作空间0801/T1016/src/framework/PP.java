package framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;



public class PP {
	
	public static WebDriver driver;
	public static  void main(String[] args) throws IOException{
    String[] s=new String[2];
	BrowserEngine browserEngine = new BrowserEngine();
	s=browserEngine.initConfigData();
	System.out.println(s[0]); 
	System.out.println(s[1]);
	browserEngine.getBrowser(s);
	//不能打印整个数组！！！
}
}
