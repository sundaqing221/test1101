import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxStart {
	public static void main(String[] args) throws InterruptedException{
		
 //支持firefox43.0及以下吧版本，更高版本无法打开
		//由于使用IE、chrome均会出现不同程度的问题，基于能力限制，推荐使用firefox 浏览器进行自动化测试
		//问题解决了！！！ firefox48版本以上的使用geckodriver驱动 
		//selenium3  必须jdk1.8以上 浏览器兼容 48以上 此外还需要下载浏览器驱动 geckodriver驱动   IE CHROME 同理 需要下载对应浏览器驱动 注意版本问题
		    System.setProperty(
		    		"webdriver.gecko.driver",
		    		"C:\\Program Files\\Mozilla Firefox\\geckodriver.exe"
		    		);
//		          设置geckodriver驱动（火狐驱动）地址
	        WebDriver driver = new FirefoxDriver(); 
	        //最大化窗口  
	        driver.manage().window().maximize();  
	        //设置隐性等待时间  
	        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  	          
	        // get()打开一个站点  
	        driver.get("https://www.baidu.com");  
	        //getTitle()获取当前页面title的值  
	        System.out.println("当前打开页面的标题是： "+ driver.getTitle());  	          
	        //关闭并退出浏览器  
	        driver.quit();
	        
	        //不知道为何会出现报错信息，但是浏览器时正常运行的 所以就不管 了 哈哈
	}
}
