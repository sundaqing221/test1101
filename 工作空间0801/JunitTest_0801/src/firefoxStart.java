import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxStart {
	public static void main(String[] args) throws InterruptedException{
		
 //֧��firefox43.0�����°ɰ汾�����߰汾�޷���
		//����ʹ��IE��chrome������ֲ�ͬ�̶ȵ����⣬�����������ƣ��Ƽ�ʹ��firefox ����������Զ�������
		//�������ˣ����� firefox48�汾���ϵ�ʹ��geckodriver���� 
		//selenium3  ����jdk1.8���� ��������� 48���� ���⻹��Ҫ������������� geckodriver����   IE CHROME ͬ�� ��Ҫ���ض�Ӧ��������� ע��汾����
		    System.setProperty(
		    		"webdriver.gecko.driver",
		    		"C:\\Program Files\\Mozilla Firefox\\geckodriver.exe"
		    		);
//		          ����geckodriver�����������������ַ
	        WebDriver driver = new FirefoxDriver(); 
	        //��󻯴���  
	        driver.manage().window().maximize();  
	        //�������Եȴ�ʱ��  
	        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);  	          
	        // get()��һ��վ��  
	        driver.get("https://www.baidu.com");  
	        //getTitle()��ȡ��ǰҳ��title��ֵ  
	        System.out.println("��ǰ��ҳ��ı����ǣ� "+ driver.getTitle());  	          
	        //�رղ��˳������  
	        driver.quit();
	        
	        //��֪��Ϊ�λ���ֱ�����Ϣ�����������ʱ�������е� ���ԾͲ��� �� ����
	}
}
