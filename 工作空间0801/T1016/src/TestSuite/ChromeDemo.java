package TestSuite;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDemo
{
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ChromeOptions options = new ChromeOptions();
 		options.addArguments("disable-infobars");	
		System.setProperty
		(		"webdriver.chrome.driver", 
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe"
				);
		System.setProperty 
		(       "webdriver.chrome.bin" ,
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
				); 
		driver = new ChromeDriver(options);	
		driver.manage().window().maximize();
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		 driver.quit();
	}

	@BeforeEach
	void setUp() throws Exception {  
		driver.get("http://ylkg-dev.e6best.com/manager/#/"); 
		Thread.sleep(2000);	
	}
	
	@AfterEach
	void tearDown() throws Exception {
	   	 driver.close();
	}
	@Test
	void test() {	
/*	
		 @FindBy (xpath="")
	     WebElement xx
	    public void xx (int cansu1,int sansu2) {
         xx.webdriver-api
	    }*/		
/*        login xxx=PageFactory.initElements(driver,classname.class);
    	 xxx.xx(canshu1, canshu2);
		*/
	}
}
