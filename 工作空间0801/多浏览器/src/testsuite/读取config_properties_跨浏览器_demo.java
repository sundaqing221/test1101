package testsuite;

import java.io.IOException;

import org.omg.PortableServer.ThreadPolicy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import framrwork.BrowserEngine;

public class ��ȡconfig_properties_�������_demo {
	public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
		BrowserEngine browserEngine = new BrowserEngine();
		browserEngine.initConfigData();
		driver=browserEngine.getBrowser();
		driver.findElement(By.id("key")).sendKeys("iPhone 7");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='search']/div/div[2]/button")).click();
		driver.quit();
	}
}
