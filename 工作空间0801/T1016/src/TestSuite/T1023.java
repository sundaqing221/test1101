package TestSuite;

import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import framework.BrowserEngine;

public class T1023 {
	
	public WebDriver driver;
	public String arr1[];
	@BeforeAll
	public void setUp() throws IOException{
		BrowserEngine browserEngine = new BrowserEngine();
		arr1=browserEngine.initConfigData();
	    System.out.println(arr1);
	
	}
//	
//	@Test
//	public void clickNews(){
//		
//		driver.findElement(By.id("key")).sendKeys("iPhone 7");
//		driver.findElement(By.xpath("//*[@id='search']/div/div[2]/button")).click();
//	}
	
//	@AfterAll
//	public void tearDown(){
//		driver.quit();
//	}
// 
 
}
