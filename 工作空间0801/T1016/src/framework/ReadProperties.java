package framework;
 
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
public class ReadProperties {
	
	public static String browser_Name;
	public static String server_Url;
	public static String[] main(String[] args) throws IOException {
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
}
