package framework;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class BrowserEngine {
	
	public WebDriver driver;
	public static String browser_Name;
	public static String server_Url;
	
	public String[] initConfigData() throws IOException{
		Properties p = new Properties();
		InputStream ips = new FileInputStream(".\\TestConfig\\config.properties");
		p.load(ips);
		browser_Name=p.getProperty("browserName");
		server_Url = p.getProperty("URL");
		String[] arr = new String[2]; 
		arr[0]=browser_Name;
		arr[1]=server_Url ;
		ips.close();	
		return arr;
	}
	
	public  void getBrowser(String arr[]){
		if(arr[0]=="Chrome") {
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
			driver= new ChromeDriver();
			Logger1.Output(LogType1.LogTypeName1.INFO, "Launching Chrome ...");
		    driver.get(arr[1]);
		    Logger1.Output(LogType1.LogTypeName1.INFO, "Open URL: "+ arr[1]);
		    driver.manage().window().maximize();
		    Logger1.Output(LogType1.LogTypeName1.INFO, "Maximize browser...");
		    callWait(5);	
		}
		else if(arr[0]=="FireFox") {
			System.setProperty(
		    		"webdriver.gecko.driver",
		    		"C:\\Program Files\\Mozilla Firefox\\geckodriver.exe"
		    		);	
		driver = new FirefoxDriver() ;
		Logger1.Output(LogType1.LogTypeName1.INFO, "Launching Firefox ...");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		System.setProperty 
		(
				"webdriver.chrome.bin" ,
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe"
				); 
		driver= new ChromeDriver();
		Logger1.Output(LogType1.LogTypeName1.INFO, "Launching Chrome ...");
	    driver.get(arr[1]);
	    Logger1.Output(LogType1.LogTypeName1.INFO, "Open URL: "+ arr[1]);
	    driver.manage().window().maximize();
	    Logger1.Output(LogType1.LogTypeName1.INFO, "Maximize browser...");
	    callWait(5);
		}
	}

	
	/*
	 * 关闭浏览器并退出方法
	 */
	
	public void tearDown() throws InterruptedException{
		
		Logger1.Output(LogType1.LogTypeName1.INFO, "Closing browser...");
		driver.quit();
		Thread.sleep(3000);
	}
	
	/*
	 * 隐式时间等待方法
	 */
	public void callWait(int time){
		
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
		Logger1.Output(LogType1.LogTypeName1.INFO, "Wait for "+time+" seconds.");
	}


	
}
 
