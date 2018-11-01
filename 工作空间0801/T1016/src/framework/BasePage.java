package framework;
 
import java.util.Iterator;
import java.util.Set;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


//构造一些基础方法 
public class BasePage {
	
	public static WebDriver driver;
	public static String pageTitle;
	public static String pageUrl;
	
	/*
	 * 构造方法
	 */
	public BasePage (WebDriver driver){
		BasePage.driver = driver;
	}
	
	/*
	 * 在文本框内输入字符
	 */
	protected void type(WebElement element , String text){
		try {
				if (element.isEnabled()) {
				    element.clear();
				    Logger1.Output(LogType1.LogTypeName1.INFO, "Clean the value if any in "+ element.toString()+".");
					element.sendKeys(text);
					Logger1.Output(LogType1.LogTypeName1.INFO, "Type value is: " + text+".");
				}
			} catch (Exception e) {
				Logger1.Output(LogType1.LogTypeName1.ERROR, e.getMessage()+".");
				}
			
		}
	
	/*
	 * 点击元素，这里指点击鼠标左键
	 */	
	protected void click(WebElement element){
			
		try {
				if (element.isEnabled()) {
						element.click();
						Logger1.Output(LogType1.LogTypeName1.INFO, "Element: "+element.toString()+" was clicked.");
					}
				} catch (Exception e) {
						Logger1.Output(LogType1.LogTypeName1.ERROR, e.getMessage()+".");
						}
			
		}
		
	/*
	 * 在文本输入框执行清除操作
	 */
	protected void clean(WebElement element){
			
		try {
				if (element.isEnabled()) {
					element.clear();
					Logger1.Output(LogType1.LogTypeName1.INFO, "Element "+element.toString()+" was cleaned.");
				}
			} catch (Exception e) {
				Logger1.Output(LogType1.LogTypeName1.ERROR, e.getMessage()+".");
			}
			
		}
	
	/*
	 * 判断一个页面元素是否显示在当前页面
	 */  
	protected void verifyElementIsPresent(WebElement element){
	    	
	    try {
				if (element.isDisplayed()) {
					Logger1.Output(LogType1.LogTypeName1.INFO, "This Element " + element.toString().trim()+" is present.");
						
				}
			} catch (Exception e) {
				Logger1.Output(LogType1.LogTypeName1.ERROR, e.getMessage()+".");
			}
	    }
	
	/*
	 * 获取页面的标题
	 */
	protected String getCurrentPageTitle(){
	    
	    pageTitle=driver.getTitle();
	    Logger1.Output(LogType1.LogTypeName1.INFO, "Current page title is "+pageTitle);
	    return pageTitle;
	   }
	
	/*
	 * 获取页面的url
	 */
       protected String getCurrentPageUrl(){
	    
	    pageUrl=driver.getCurrentUrl();
	    Logger1.Output(LogType1.LogTypeName1.INFO, "Current page title is "+pageUrl);
	    return pageUrl;
	   } 
   
      /*
       * 处理多窗口之间切换
       */
      public void switchWindow(){
	 	
	  String currentWindow = driver.getWindowHandle();// 获取当前窗口句柄  
          Set<String> handles = driver.getWindowHandles();// 获取所有窗口句柄  
          Logger1.Output(LogType1.LogTypeName1.INFO, "当前窗口数量： "+ handles.size());  
          Iterator<String> it = handles.iterator();  
          while (it.hasNext()) {  
              if (currentWindow == it.next()) {  
            	   continue;
              }  
              try {  
            	  driver.close();// 关闭旧窗口
                  WebDriver window = driver.switchTo().window(it.next());// 切换到新窗口 
                  Logger1.Output(LogType1.LogTypeName1.INFO, "new page title is "+ window.getTitle());
              } catch (Exception e) {  
            	   Logger1.Output(LogType1.LogTypeName1.ERROR,"法切换到新打开窗口"+ e.getMessage());  
                 
            }  
            //driver.close();//关闭当前焦点所在的窗口  
        }  
        // driver.switchTo().window(currentWind);//ow回到原来页面  
	}      
}
