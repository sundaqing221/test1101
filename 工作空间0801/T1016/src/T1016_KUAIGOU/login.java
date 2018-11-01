package T1016_KUAIGOU;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {
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

	 //定义登陆方法
    public void login (String Username,String Password) {
    	UserInputbox.sendKeys(Username);
    	PasswordInputbox.sendKeys(Password);
    	loginButton.click();	
    }
}
