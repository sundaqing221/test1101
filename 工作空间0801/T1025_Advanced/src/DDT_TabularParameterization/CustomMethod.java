package DDT_TabularParameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

//自定义方法

public class  CustomMethod /*克斯疼 么得德*/ {
	
	public static WebDriver driver;
	//提前找好页面元素  便于页面元素更改后的修改 
    //用户名输入框
	 @FindBy (xpath="//*[@id=\"app\"]/div/div/div/div[2]/div/form/div[1]/div/div/input")
    WebElement UserInputbox ;
	 //密码输入框
	 @FindBy (xpath="//*[@id=\"app\"]/div/div/div/div[2]/div/form/div[2]/div/div/input")
    WebElement  PasswordInputbox; 
	 //登陆按钮
	 @FindBy (xpath="//*[@id=\"app\"]/div/div/div/div[2]/div/form/div[3]/div/button")
    WebElement loginButton; 
	 
	  //@启动谷歌浏览器
	public static void openBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		//设置不显示信息栏
		//暂时失败
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
		driver=new ChromeDriver(options);
	}
	
	  //@打开网址 参数 URL
	public static void openUrl(String URL) {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(URL);
    }
	
	 //@登陆
	   public void login (String Username,String Password) {
	   	UserInputbox.sendKeys(Username);
	   	PasswordInputbox.sendKeys(Password);
	   	loginButton.click();	
	   }

     //@退出浏览器
    public static void closeBrowser() {
        driver.quit();
    }
    
}
