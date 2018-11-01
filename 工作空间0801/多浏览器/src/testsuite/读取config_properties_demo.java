package testsuite;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
public class 读取config_properties_demo {
	
	public static String browser_Name;
	public static String server_Url;
	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		InputStream ips = new FileInputStream("D:\\工作空间0801\\多浏览器\\src\\TestConfig\\config.properties");
		p.load(ips);
		browser_Name=p.getProperty("browserName");
		server_Url = p.getProperty("URL");
		System.out.println(browser_Name);
		System.out.println(server_Url);
		ips.close();
			
	}
 
}

