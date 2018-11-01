package T1016_KUAIGOU;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class T2 {
	private static WebDriver driver;  //private 定义变量   类内各方法共享 ！
	                                  //public  定义变量时  包下各类共享 ！
	private static ChromeOptions options;
	
//	参数化  古老方法 暂时放着  是否有更加简便的方法
//	private String user;
//	private String password;
//    @Parameters
//    public static Collection<Object[]> paraData() {
//        Object[][] object = { { "admin2", "12345678"}, { "", "12345678",}, { "", "",}};
//        return Arrays.asList(object);
//    }
//    public T2(String user,String password) {
//        this.user = user;
//        this.password = password;
//    }
	
	//启动浏览器
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll");
		options = new ChromeOptions();
 		options.addArguments("disable-infobars");	
		System.setProperty
		(
				"webdriver.chrome.driver", 
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe"
				)
		;
		System.setProperty 
		(
				"webdriver.chrome.bin" ,
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
				); 
		driver = new ChromeDriver(options);	
		//最大化
		driver.manage().window().maximize();  
        }
    //输入网址
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll");
  	    //推出浏览器  
        driver.quit(); 	
	}
    //注销
	@BeforeEach
	void setUp() throws Exception {
		driver.get("http://ylkg-dev.e6best.com/manager/#/");    
        Thread.sleep(2000);	
        System.out.println("@BeforeEach");
    	WebElement UserInputbox=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/form/div[1]/div/div/input"));
        //点击用户名输入框
        UserInputbox.click();
        //输入用户名
        UserInputbox.sendKeys("admin2"); 
        WebElement PasswordInputbox=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/form/div[2]/div/div/input"));
        //点击密码输入框
        PasswordInputbox.click();
        //输入密码
        PasswordInputbox.sendKeys("12345678");
        WebElement loginButton=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div/form/div[3]/div/button"));
        //点击登陆按钮
        loginButton.click();  
        //等待2s
        Thread.sleep(2000);
        WebElement PersonalCenter=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/ul/div[2]/li/div[1]"));
        //点击个人中心
        PersonalCenter.click();
        Thread.sleep(1000);  	 
	}
    //关闭浏览器
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@AfterEach");
	    WebElement WriteoffButton=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/ul/div[2]/li/div[2]/ul/li[2]"));
        //点击注销按钮
        WriteoffButton.click();
	}
	//断言是否登陆成功
	@Test
	void test1() {
		System.out.println("@Test1");
		//验证是否成功登陆
        String tittle=driver.getCurrentUrl();
        System.out.println(tittle);
        Assert.assertEquals("http://ylkg-dev.e6best.com/manager/#/Prod/ProdList", tittle);	
	}
	//测试
	@Test
	void test2() {
		System.out.println("@Test2");
	}
}
