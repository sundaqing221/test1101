package TESTSUITE;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import OO.BrowserEngine;
import OO.LogType;
import OO.Logger;

class demo2 {

	public static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		BrowserEngine browserEngine = new BrowserEngine();
		browserEngine.initConfigData();
		driver=browserEngine.getBrowser();	
	}
	@AfterAll
	static void tearDownAfterClass() throws Exception {
    driver.quit();
    Logger.Output(LogType.LogTypeName.INFO, "quit!!!!! ");
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		driver.findElement(By.id("key")).sendKeys("iPhone 7");
		Logger.Output(LogType.LogTypeName.INFO, "submit keywords");
		driver.findElement(By.xpath("//*[@id='search']/div/div[2]/button")).click();
		Logger.Output(LogType.LogTypeName.INFO, "click button");
	}

}
