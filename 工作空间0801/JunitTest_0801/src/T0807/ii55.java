package T0807;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ii55 {

  @Before  
  void hh() {
	  System.out.println("1");
  }
  @Test
  public void test22() throws Exception {
	  System.out.println("webdriver.chrome.driver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		//���ò���ʾ��Ϣ��
		//��ʱʧ��
		System.setProperty
		(
				"webdriver.chrome.driver", 
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe"
				)
		;
		//����chrome.driverλ��
		System.setProperty 
		(
				"webdriver.chrome.bin" ,
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
				); 
		//����chrome.exeλ��
		WebDriver driver = new ChromeDriver(options);	
		//ʵ����webdriver�Ķ��������ȸ������
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://ylkg-dev.e6best.com/manager/#/");
        System.out.println("2");
        driver.findElement(By.xpath("//div[@id='app']/div")).click();
        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).clear();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin2");
        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).clear();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
        driver.findElement(By.xpath("//button[@type='button']")).click();
        driver.findElement(By.xpath("//div[@id='app']/div/div/div/ul/div[2]/li/div")).click();
//      driver.findElement(By.xpath("//div[@id='app']/div/div/div/ul/div[2]/li/div[2]/ul/li[2]")).click();
                 
  }
}
