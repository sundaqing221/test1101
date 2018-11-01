package T0802;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class 货架后台脚本demo {
	
	private static WebDriver driver;
	private int c=1;
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
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
		System.setProperty(
	    		"webdriver.gecko.driver",
	    		"C:\\Program Files\\Mozilla Firefox\\geckodriver.exe"
	    		);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);  
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
    	driver.close();
  	    //关闭浏览器	
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
		driver.get("http://ylkg-dev.e6best.com/manager/#/");
	     //进入登录网址
	    //driver.manage().window().maximize();
	    //最大化窗口
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
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
    	WebElement PersonalCenter=driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/ul/div[2]/li/div[1]"));
	    //个人中心
	    PersonalCenter.click();
	    //点击个人中心
	    WebElement loginout=driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/button"));
	    //[注销]button
	    loginout.click();
	    //点击注销 	
	}
	@Disabled
	@Test
	void test1() throws InterruptedException {
	System.out.println("test1");
	System.out.println("1：产品关键字搜索测试");
    String keyWord="海南";
    WebElement key=driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div/input"));
    //[关键字]input box
    key.click();
    key.sendKeys(keyWord);
    //输入关键字
    WebElement searchButton=driver.findElement(By.xpath("//button[@type='button']"));
    //[搜索]button
    searchButton.click();
    //点击搜索
    Thread.sleep(2000);//等待2s..
    for(int i=1;i<=10;i++) { 
    	System.out.println("第"+i+"个循环开始： >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
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
 	    		Assert.assertTrue(key1.contains(keyWord));
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
    System.out.println("产品关键字搜索测试完成--------------------------------------------------");
	}
	 @Disabled
	 @Test
	    public void test2() throws Exception { 
	    	System.out.println("2：按产品类型搜索");
		    //全部类型-一级分类
		    for(int i=1;i<=4;i++) 
		    {
		    	System.out.println("1");
		        WebElement Typeinput=driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div[1]/div[1]/input"));
		        Typeinput.click();
		        System.out.println("Typeinput.click");
		        WebElement TypeAll=driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[1]/div/div[2]/div/span/ul/li"));
		        TypeAll.click();
		        System.out.println("TypeAll.click");
		    	String xpath="//div[@id='app']/div/div/div[2]/div[2]/div/div/div/div[2]/div/div/div/div[2]/div/span/span/ul/li["+i+"]";
		    	WebElement secondType=driver.findElement(By.xpath(xpath));
		    	String keywords2;
		    	keywords2= secondType.getText();
		    	secondType.click();
		    	Thread.sleep(2000);
		    	//点击二级分类
		    	WebElement searchButton2=driver.findElement(By.xpath("//button[@type='button']"));
		    	searchButton2.click();
		    	//点击搜索
		    	for(int a=1;a<=10;a++) {
		    		Thread.sleep(2000);
		    		By locator = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div["+a+"]/div/div/p[1]");  
			        boolean xkey=isElementExsit(driver,locator);
			        System.out.println(xkey);
			        //判断结果是否存在
			        //搜索结果是否匹配
			    	if (xkey==true)
			    	//boolean判断时皆用==符号
			    	{   
			    		System.out.println("第"+a+"个存在");
			    		String xpath1 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div["+a+"]/div/div/p[1]";
			    		driver.findElement(By.xpath(xpath1)).click();
			    		String type=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div/div[3]/div/form/div/div[1]/div[4]/div/div/div[1]/span[2]")).getText();
			 	    	System.out.println("第"+a+"个产品  产品类型为："+type);
			 	    	 try {  
			 	    		Assert.assertEquals(type,keywords2);
			 	    		System.out.println("第"+a+"个搜索结果正确");
			 	        } catch (Error e) {  
			 	            System.out.println("搜索结果判断错误!");  
			 	            //断言失败抛出错误    catch( Error e)
			 	        }  
			 	    	//Assert.assertTrue(key1.contains(keyWord));
			 	    	//元素存在，判断搜索内容是否正确!!!!!
			 	    	 driver.navigate().back();
			 	    	 //页面返回
			    	}else
			    	{	
			          System.out.println("第"+a+"个产品不存在 跳出循环！");
			          System.out.println("搜索结果为："+(a-1));
			          a=11;
		              //元素不存在，跳出循环
			    	} 	
		    	}	
		    }
		    System.out.println("按产品类型搜索测试完成----------------------------------------------------");
	    }
	    @Disabled
//4：按产品分类搜索
	    @Test
	    public void test3() throws Exception { 
	    	System.out.println("按产品分类搜索");
//	 	    for(int i=1;i<0;i++) {
//	 	     	WebElement gg1=driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div[1]/span[1]"));
//	    	    gg1.click();
//	    	    //点击产品分类
//	 	        By locator=By.xpath("html/body/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div[2]/ul[2]/li["+(i+1)+"]");
//	 	        boolean key1;
//	 	        key1=isElementExsit(driver,locator);
//	 	        if(key1==true) {
//	 	        	c=c++;
//	 	        	System.out.println("c="+c);
//	 	        }
//	 	        else {
//	 	        	i=-2200;
//	 	        }		
//	 	    }
//	 	   WebElement gg2=driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div[1]/span[1]"));
//   	       gg2.click();
	 	    System.out.println(c);
	 	    //获取数量
	 	    if(c>0) {
	 	    	for
	 	    	(
	 	    	 int i=2;i>=c+2;i++
		 	    		) 
		 	    {
	 	    		System.out.println("for");
		 	    	WebElement typeInput1=driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div[1]/span[1]"));
		 	    	typeInput1.click();
		 	    	String xpath="html/body/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div[2]/ul[2]/li["+(i)+"]";
		 	    	WebElement type=driver.findElement(By.xpath(xpath));
		 	    	String keywords=type.getText();
		 	    	type.click();
		 	    	WebElement searchButton=driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/button"));
		 	    	searchButton.click();
		 	    	for(int a=1;a<=10;a++) {
		 	    		By locator = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div["+a+"]/div/div/p[1]");  
		 		        boolean xkey=isElementExsit(driver,locator);
		 		        System.out.println(xkey);
		 		        //判断结果是否存在
		 		        //搜索结果是否匹配
		 		    	if (xkey==true)
		 		    	//    boolean判断时皆用==符号
		 		    	{   
		 		    		System.out.println("第"+a+"个存在");
		 		    		String xpath1 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div["+a+"]/div/div/p[1]";
		 		    		driver.findElement(By.xpath(xpath1)).click();
		 		    		String type2=driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[3]/div/form/div/div[1]/div[5]/div/div/div[1]/span[2]")).getText();
		 		 	    	System.out.println("第"+a+"个产品  产品分类为："+type2);
		 		 	    	 try {  
		 		 	    		Assert.assertEquals(type,keywords);
		 		 	    		System.out.println("第"+a+"个搜索结果正确");
		 		 	        } catch (Error e) {  
		 		 	            System.out.println("搜索结果判断错误!");  
		 		 	            //断言失败抛出错误    catch( Error e)
		 		 	        }  
		 		 	    	//Assert.assertTrue(key1.contains(keyWord));
		 		 	    	//元素存在，判断搜索内容是否正确!!!!!
		 		 	    	 driver.navigate().back();
		 		 	    	 //页面返回
		 		    	}
		 		    	else
		 		    	{	
		 		          System.out.println("第"+a+"个产品不存在 跳出循环！");
		 		          System.out.println("搜索结果为："+(a-1));
		 		          a=11;
		 	              //元素不存在，跳出循环
		 		    	} 
		 	    	}
		 	    }
	 	    }
	 		else {
	 			System.out.println("类型不存在");
 	    	}   
	    }
}
