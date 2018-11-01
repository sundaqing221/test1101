import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeStart_0801
{
	public static void main(String[] args) throws InterruptedException{
		
		System.out.println("webdriver.chrome.driver");
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
		WebDriver driver = new ChromeDriver(options);	
		//实例化webdriver的对象，启动谷歌浏览器
		driver.manage().window().maximize();
		//最大化窗口
        driver.get("http://www.baidu.com/");  
        //通过对象driver调用具体的get方法来打开网页            
        Thread.sleep(2000);
        driver.quit();
        //退出浏览器  
	}
}
