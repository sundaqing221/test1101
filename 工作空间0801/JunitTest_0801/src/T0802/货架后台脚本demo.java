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

class ���ܺ�̨�ű�demo {
	
	private static WebDriver driver;
	private int c=1;
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
  	    //�ر������	
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
		driver.get("http://ylkg-dev.e6best.com/manager/#/");
	     //�����¼��ַ
	    //driver.manage().window().maximize();
	    //��󻯴���
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
		
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
    	WebElement PersonalCenter=driver.findElement(By.xpath("html/body/div[1]/div/div/div[1]/ul/div[2]/li/div[1]"));
	    //��������
	    PersonalCenter.click();
	    //�����������
	    WebElement loginout=driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[4]/button"));
	    //[ע��]button
	    loginout.click();
	    //���ע�� 	
	}
	@Disabled
	@Test
	void test1() throws InterruptedException {
	System.out.println("test1");
	System.out.println("1����Ʒ�ؼ�����������");
    String keyWord="����";
    WebElement key=driver.findElement(By.xpath(".//*[@id='app']/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[3]/div/input"));
    //[�ؼ���]input box
    key.click();
    key.sendKeys(keyWord);
    //����ؼ���
    WebElement searchButton=driver.findElement(By.xpath("//button[@type='button']"));
    //[����]button
    searchButton.click();
    //�������
    Thread.sleep(2000);//�ȴ�2s..
    for(int i=1;i<=10;i++) { 
    	System.out.println("��"+i+"��ѭ����ʼ�� >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
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
 	    		Assert.assertTrue(key1.contains(keyWord));
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
    System.out.println("��Ʒ�ؼ��������������--------------------------------------------------");
	}
	 @Disabled
	 @Test
	    public void test2() throws Exception { 
	    	System.out.println("2������Ʒ��������");
		    //ȫ������-һ������
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
		    	//�����������
		    	WebElement searchButton2=driver.findElement(By.xpath("//button[@type='button']"));
		    	searchButton2.click();
		    	//�������
		    	for(int a=1;a<=10;a++) {
		    		Thread.sleep(2000);
		    		By locator = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div["+a+"]/div/div/p[1]");  
			        boolean xkey=isElementExsit(driver,locator);
			        System.out.println(xkey);
			        //�жϽ���Ƿ����
			        //��������Ƿ�ƥ��
			    	if (xkey==true)
			    	//boolean�ж�ʱ����==����
			    	{   
			    		System.out.println("��"+a+"������");
			    		String xpath1 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div["+a+"]/div/div/p[1]";
			    		driver.findElement(By.xpath(xpath1)).click();
			    		String type=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div/div[3]/div/form/div/div[1]/div[4]/div/div/div[1]/span[2]")).getText();
			 	    	System.out.println("��"+a+"����Ʒ  ��Ʒ����Ϊ��"+type);
			 	    	 try {  
			 	    		Assert.assertEquals(type,keywords2);
			 	    		System.out.println("��"+a+"�����������ȷ");
			 	        } catch (Error e) {  
			 	            System.out.println("��������жϴ���!");  
			 	            //����ʧ���׳�����    catch( Error e)
			 	        }  
			 	    	//Assert.assertTrue(key1.contains(keyWord));
			 	    	//Ԫ�ش��ڣ��ж����������Ƿ���ȷ!!!!!
			 	    	 driver.navigate().back();
			 	    	 //ҳ�淵��
			    	}else
			    	{	
			          System.out.println("��"+a+"����Ʒ������ ����ѭ����");
			          System.out.println("�������Ϊ��"+(a-1));
			          a=11;
		              //Ԫ�ز����ڣ�����ѭ��
			    	} 	
		    	}	
		    }
		    System.out.println("����Ʒ���������������----------------------------------------------------");
	    }
	    @Disabled
//4������Ʒ��������
	    @Test
	    public void test3() throws Exception { 
	    	System.out.println("����Ʒ��������");
//	 	    for(int i=1;i<0;i++) {
//	 	     	WebElement gg1=driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/div/div/div[1]/div[2]/div/div[2]/div/div[1]/span[1]"));
//	    	    gg1.click();
//	    	    //�����Ʒ����
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
	 	    //��ȡ����
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
		 		        //�жϽ���Ƿ����
		 		        //��������Ƿ�ƥ��
		 		    	if (xkey==true)
		 		    	//    boolean�ж�ʱ����==����
		 		    	{   
		 		    		System.out.println("��"+a+"������");
		 		    		String xpath1 = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div["+a+"]/div/div/p[1]";
		 		    		driver.findElement(By.xpath(xpath1)).click();
		 		    		String type2=driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/div/div/div/div[3]/div/form/div/div[1]/div[5]/div/div/div[1]/span[2]")).getText();
		 		 	    	System.out.println("��"+a+"����Ʒ  ��Ʒ����Ϊ��"+type2);
		 		 	    	 try {  
		 		 	    		Assert.assertEquals(type,keywords);
		 		 	    		System.out.println("��"+a+"�����������ȷ");
		 		 	        } catch (Error e) {  
		 		 	            System.out.println("��������жϴ���!");  
		 		 	            //����ʧ���׳�����    catch( Error e)
		 		 	        }  
		 		 	    	//Assert.assertTrue(key1.contains(keyWord));
		 		 	    	//Ԫ�ش��ڣ��ж����������Ƿ���ȷ!!!!!
		 		 	    	 driver.navigate().back();
		 		 	    	 //ҳ�淵��
		 		    	}
		 		    	else
		 		    	{	
		 		          System.out.println("��"+a+"����Ʒ������ ����ѭ����");
		 		          System.out.println("�������Ϊ��"+(a-1));
		 		          a=11;
		 	              //Ԫ�ز����ڣ�����ѭ��
		 		    	} 
		 	    	}
		 	    }
	 	    }
	 		else {
	 			System.out.println("���Ͳ�����");
 	    	}   
	    }
}
