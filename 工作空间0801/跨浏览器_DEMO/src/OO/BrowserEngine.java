package OO;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
 

//跨浏览器自定义java方法· 
public class BrowserEngine {
	
	public WebDriver driver;
	public static String browserName;
	public static String serverUrl;
	
	
//加载配置文件
public void initConfigData() throws IOException{
		Properties p = new Properties();
		// 加载配置文件
		InputStream ips = new FileInputStream(".\\TestConfig\\config.properties");
		p.load(ips);
		Logger.Output(LogType.LogTypeName.INFO, "Start to select browser name from properties file");
		browserName=p.getProperty("browserName");
		Logger.Output(LogType.LogTypeName.INFO, "Your had select test browser type is: "+ browserName);
		serverUrl = p.getProperty("URL");
		Logger.Output(LogType.LogTypeName.INFO, "The test server URL is: "+ serverUrl);
		ips.close();
	}


//加载配置文件后 启动浏览器并打开网址
	public  WebDriver getBrowser(){
		if(browserName.equalsIgnoreCase("Chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
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
			driver= new ChromeDriver(options);
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
		    System.setProperty(
		    		"webdriver.gecko.driver",
		    		"C:\\Program Files\\Mozilla Firefox\\geckodriver.exe"
		    		);	
		driver = new FirefoxDriver() ;
			}
		driver.get(serverUrl);
		Logger.Output(LogType.LogTypeName.INFO, "Open URL: "+ serverUrl);
		driver.manage().window().maximize();
		Logger.Output(LogType.LogTypeName.INFO, "Maximize browser...");
		callWait(5);
		return driver;
	}
	
	
	//线程等待 
	public void tearDown() throws InterruptedException{
		Logger.Output(LogType.LogTypeName.INFO, "Closing browser...");
		driver.quit();
		Thread.sleep(3000);
	}
	
	/*
	 * 隐式时间等待方法
	 */
	public void callWait(int time){
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		Logger.Output(LogType.LogTypeName.INFO, "Wait for "+time+" seconds.");
	}
	
}
 
