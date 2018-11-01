package T1016_KUAIGOU;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

class demo1 {
	static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll");
		ChromeOptions options = new ChromeOptions();
 		options.addArguments("disable-infobars");	
	    //设置options
		System.setProperty
		(
				"webdriver.chrome.driver", 
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe"
				)
		;
		//设置webdriver. chrome.driver地址
		System.setProperty 
		(
				"webdriver.chrome.bin" ,
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
				); 
		//设置chrome.exe地址
		driver = new ChromeDriver(options);	
		//最大化
		driver.manage().window().maximize();
	    //ͨ输入网址 
		driver.get("http://ylkg-dev.e6best.com/manager/#/"); 
		//等待2s（单位以毫秒记）
		Thread.sleep(2000);
        }

	@Test
	void test() {
	 login log=PageFactory.initElements(driver, login.class);
	 log.login("admin1", "12345678");
	}

}
