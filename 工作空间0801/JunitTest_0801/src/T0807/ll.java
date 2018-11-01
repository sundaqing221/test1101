package T0807;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ll {
	public static boolean isElementExsit(WebDriver driver, By locator) {  
        boolean flag = false;  
        try {  
            WebElement element=driver.findElement(locator);  
            //webElement Ԫ��
            flag=null!=element;  
        } catch (NoSuchElementException e) {  
            System.out.println("Element:" + locator.toString()  
                    + " is not exsit!");  
        }  
        return flag;
    }
	
	public static void isElement(String keywords) throws InterruptedException {  
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
	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-infobars");
	WebDriver driver = new ChromeDriver(options);	
	driver.get("http://ylkg-dev.e6best.com/manager/#/");
	//ʵ����webdriver�Ķ��������ȸ������
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  
	System.out.println("BeforeEach");
    WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
    //[�û���]input box
    username.sendKeys("admin3");
    //�����û���
    WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
    //[����]input box
    password.sendKeys("12345678");
    //��������
    WebElement loginButton=driver.findElement(By.xpath("//button[@type='button']"));
    loginButton.click();
    //�����¼��ť
    Thread.sleep(2000);
    //�ȴ�2s..
    WebElement key=driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div/input"));
    //[�ؼ���]input box
    key.click();
    key.sendKeys(keywords);
    //����ؼ���
    WebElement searchButton=driver.findElement(By.xpath("//button[@type='button']"));
    //[����]button
    searchButton.click();
    //�������
    Thread.sleep(2000);//�ȴ�2s..
    for(int i=1;i<=10;i++) { 
    	System.out.println("��"+i+" ѭ��");
        By locator = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div["+i+"]/div/div/p[1]");  
        boolean xkey=isElementExsit(driver,locator);
        System.out.println(xkey);
        //�жϽ���Ƿ����
        //��������Ƿ�ƥ��
    	if (xkey==true)
    	//    boolean�ж�ʱ����==����
    	{   
    		System.out.println("��"+i+"������");
    		String xpath1 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div["+i+"]/div/div/p[1]";
    		String key1=driver.findElement(By.xpath(xpath1)).getText();
 	    	System.out.println("��"+i+"����Ʒ  ��Ʒ����"+key1);
 	    	 try {  
 	    		Assert.assertTrue(key1.contains(keywords));
 	    		System.out.println("��"+i+"�����������ȷ");
 	        } catch (Error e) {  
 	            System.out.println("��������жϴ���!");  
 	            //����ʧ���׳�����    catch( Error e)
 	        }  
 	    	//Assert.assertTrue(key1.contains(keyWord));
 	    	//Ԫ�ش��ڣ��ж����������Ƿ���ȷ!!!!!
    	}else
    	{	
          System.out.println("��"+i+"�������� ����ѭ����");
          System.out.println("�������Ϊ��"+(i-1));
          i=11;
          //Ԫ�ز����ڣ�����ѭ��
    	}   
    } 
    //ѭ���ж���������Ƿ���ȷ���Ƿ�ƥ��ؼ���
	Thread.sleep(3000);//�ȴ�3s..
    WebElement loginout=driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/button"));
    loginout.click();
    //���ע�� 	
    driver.close();  
    //�ر������
	}
}
