package testsuite;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framrwork.BrowserEngine;
import framrwork.LogType;
import framrwork.Logger;

class TestLaunchBrowser_demo {
	
	public static WebDriver driver ;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		BrowserEngine browserEngine = new BrowserEngine();
		browserEngine.initConfigData();
		driver=browserEngine.getBrowser();
	}

	@Test
	void test() throws InterruptedException {
		driver.findElement(By.id("key")).sendKeys("iPhone 7");
		Logger.Output(LogType.LogTypeName.INFO, "ÊäÈë¹Ø¼ü×Ö ");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='search']/div/div[2]/button")).click();
		Logger.Output(LogType.LogTypeName.INFO, "µã»÷ËÑË÷");
		driver.quit();
	}

}
