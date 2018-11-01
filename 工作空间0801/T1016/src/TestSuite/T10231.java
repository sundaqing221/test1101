package TestSuite;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import framework.LogType1;
import framework.Logger1;

class T10231 {

	
	public static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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
		driver = new ChromeDriver(options);
		Logger1.Output(LogType1.LogTypeName1.INFO, "Open URL: "+ "启动谷歌浏览器");
		driver.manage().window().maximize();
		Logger1.Output(LogType1.LogTypeName1.INFO, "Open URL: "+ "窗口最大化");
        driver.get("http://re.jd.com/");  
        Logger1.Output(LogType1.LogTypeName1.INFO, "Open URL: "+ "打开京东页面");
        //通过对象driver调用具体的get方法来打开网页            
        Thread.sleep(2000);

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
		Logger1.Output(LogType1.LogTypeName1.INFO, "Open URL: "+ "退出浏览器");
	}

	@Test
	void test() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"key\"]")).sendKeys("iPhone 7");
		Logger1.Output(LogType1.LogTypeName1.INFO, "Open URL: "+ "搜索栏输入：“iphone7”");
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[2]/button")).click();
		Logger1.Output(LogType1.LogTypeName1.INFO, "Open URL: "+ "点击搜索按钮");
	}

}
