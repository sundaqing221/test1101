package TestSuite;
 
import java.io.IOException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import framework.BrowserEngine;
import framework.LogType1;
import framework.Logger1;
 
public class TestLaunchBrowser {
	
	public WebDriver driver;
	public String t1;
	public String t2;
	@BeforeAll
	public void cc() throws IOException{
	
		String[] s=new String[2];
	    BrowserEngine browserEngine = new BrowserEngine();
		s=browserEngine.initConfigData();
		t1=s[0];
		System.out.println(t1);
		t2=s[1];
		System.out.println(t2);
		if(t1=="Chrome") {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
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
			driver= new ChromeDriver();
			Logger1.Output(LogType1.LogTypeName1.INFO, "Launching Chrome ...");
		    driver.get(t2);
		    Logger1.Output(LogType1.LogTypeName1.INFO, "Open URL: "+ t2);
		    driver.manage().window().maximize();
		    Logger1.Output(LogType1.LogTypeName1.INFO, "Maximize browser...");	
		}
		else if(t1=="FireFox") {
			System.setProperty(
		    		"webdriver.gecko.driver",
		    		"C:\\Program Files\\Mozilla Firefox\\geckodriver.exe"
		    		);	
		driver = new FirefoxDriver() ;
		Logger1.Output(LogType1.LogTypeName1.INFO, "Launching Firefox ...");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		System.setProperty 
		(
				"webdriver.chrome.bin" ,
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
				); 
		driver= new ChromeDriver();
		Logger1.Output(LogType1.LogTypeName1.INFO, "Launching Chrome ...");
	    driver.get(t2);
	    Logger1.Output(LogType1.LogTypeName1.INFO, "Open URL: "+ t2);
	    driver.manage().window().maximize();
	    Logger1.Output(LogType1.LogTypeName1.INFO, "Maximize browser...");
		}
		
	}
	
	@Test
	public void clickNews(){
		driver.findElement(By.id("key")).sendKeys("iPhone 7");
		driver.findElement(By.xpath("//*[@id='search']/div/div[2]/button")).click();
	}
	
	@AfterAll
	public void tearDown(){
		driver.quit();
	}
 
 
}
