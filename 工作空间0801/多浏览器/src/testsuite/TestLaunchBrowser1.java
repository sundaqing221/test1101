package testsuite;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framrwork.BrowserEngine;
import framrwork.LogType;
import framrwork.Logger;
 

public class TestLaunchBrowser1 {
	    public WebDriver driver;
	    public void initConfigData() throws IOException{
		BrowserEngine browserEngine = new BrowserEngine();
		browserEngine.initConfigData();
		driver=browserEngine.getBrowser();
		driver.findElement(By.id("key")).sendKeys("iPhone 7");
		Logger.Output(LogType.LogTypeName.INFO, "ËÑË÷À¸ÊäÈë£ºiphone7");
		driver.findElement(By.xpath("//*[@id='search']/div/div[2]/button")).click();
		Logger.Output(LogType.LogTypeName.INFO, "µã»÷ËÑË÷");
		driver.quit();
	}
}
