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
            //webElement 元素
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
	//设置chrome.driver位置
	System.setProperty 
	(
			"webdriver.chrome.bin" ,
			"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
			); 
	//设置chrome.exe位置
	ChromeOptions options = new ChromeOptions();
	options.addArguments("disable-infobars");
	WebDriver driver = new ChromeDriver(options);	
	driver.get("http://ylkg-dev.e6best.com/manager/#/");
	//实例化webdriver的对象，启动谷歌浏览器
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  
	System.out.println("BeforeEach");
    WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
    //[用户名]input box
    username.sendKeys("admin3");
    //输入用户名
    WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
    //[密码]input box
    password.sendKeys("12345678");
    //输入密码
    WebElement loginButton=driver.findElement(By.xpath("//button[@type='button']"));
    loginButton.click();
    //点击登录按钮
    Thread.sleep(2000);
    //等待2s..
    WebElement key=driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div/input"));
    //[关键字]input box
    key.click();
    key.sendKeys(keywords);
    //输入关键字
    WebElement searchButton=driver.findElement(By.xpath("//button[@type='button']"));
    //[搜索]button
    searchButton.click();
    //点击搜索
    Thread.sleep(2000);//等待2s..
    for(int i=1;i<=10;i++) { 
    	System.out.println("第"+i+" 循环");
        By locator = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div["+i+"]/div/div/p[1]");  
        boolean xkey=isElementExsit(driver,locator);
        System.out.println(xkey);
        //判断结果是否存在
        //搜索结果是否匹配
    	if (xkey==true)
    	//    boolean判断时皆用==符号
    	{   
    		System.out.println("第"+i+"个存在");
    		String xpath1 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div["+i+"]/div/div/p[1]";
    		String key1=driver.findElement(By.xpath(xpath1)).getText();
 	    	System.out.println("第"+i+"个产品  产品名："+key1);
 	    	 try {  
 	    		Assert.assertTrue(key1.contains(keywords));
 	    		System.out.println("第"+i+"个搜索结果正确");
 	        } catch (Error e) {  
 	            System.out.println("搜索结果判断错误!");  
 	            //断言失败抛出错误    catch( Error e)
 	        }  
 	    	//Assert.assertTrue(key1.contains(keyWord));
 	    	//元素存在，判断搜索内容是否正确!!!!!
    	}else
    	{	
          System.out.println("第"+i+"个不存在 跳出循环！");
          System.out.println("搜索结果为："+(i-1));
          i=11;
          //元素不存在，跳出循环
    	}   
    } 
    //循环判断搜索结果是否正确：是否匹配关键字
	Thread.sleep(3000);//等待3s..
    WebElement loginout=driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/button"));
    loginout.click();
    //点击注销 	
    driver.close();  
    //关闭浏览器
	}
}
