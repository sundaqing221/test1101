import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeStart_0801
{
	public static void main(String[] args) throws InterruptedException{
		
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
		//��󻯴���
        driver.get("http://www.baidu.com/");  
        //ͨ������driver���þ����get����������ҳ            
        Thread.sleep(2000);
        driver.quit();
        //�˳������  
	}
}
