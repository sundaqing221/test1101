package TestSuite;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import T1016_KUAIGOU.login;
import junit.framework.Assert;

public class loginDemo1 {
	static WebDriver driver;
	String Key;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll");
		ChromeOptions options = new ChromeOptions();
 		options.addArguments("disable-infobars");	
		System.setProperty
		(
				"webdriver.chrome.driver", 
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe"
				)
		;
		System.setProperty 
		(
				"webdriver.chrome.bin" ,
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
				); 
		driver = new ChromeDriver(options);	
		driver.manage().window().maximize(); 
		driver.get("http://ylkg-dev.e6best.com/manager/#/"); 
		Thread.sleep(2000);
        }
	@Test
	void test() throws InterruptedException {
	        login log1=PageFactory.initElements(driver,login.class);
	    	 log1.login("admin1", "12345678");
	    	 Thread.sleep(2000);
	    	 Key=driver.getCurrentUrl();
	    	 Assert.assertEquals(Key,"http://ylkg-dev.e6best.com/manager/#/Prod/ProdList" ); 
	}
	@AfterEach
	void c() {
	   	 driver.close();
	}
	@AfterAll
    static void d(){
   	 driver.quit();
	}
}
