package TestSuite;
 
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
public class TestBaidu {
 
	public static void main(String[] args) {
		 //
//		 Logger logger=Logger.getLogger("baidu");
//		 PropertyConfigurator.configure(".\\Log4j.properties");
		 // 打开浏览器
		 ChromeOptions options = new ChromeOptions();
	 	 options.addArguments("disable-infobars");	
		 //设置不显示信息栏
		 //暂时失败
		 System.setProperty
		 (
				"webdriver.chrome.driver", 
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe"
				)
		 ;
		 //设置chrome.driver位置
		 System.setProperty 
		 (
				"webdriver.chrome.bin" ,
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
				); 
		 //设置chrome.exe位置
		 //实例化webdriver的对象，启动谷歌浏览器
		 WebDriver driver = new ChromeDriver(options);	
		 //最大化窗口
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     driver.get("https://www.baidu.com");
	     framework.Logger1.Output(framework.LogType1.LogTypeName1.INFO, "打开百度首页");
	     driver.findElement(By.id("kw")).sendKeys("Selenium");
	     framework.Logger1.Output(framework.LogType1.LogTypeName1.INFO, "搜索输入框输入关键字selenium");     
	}
 
}
