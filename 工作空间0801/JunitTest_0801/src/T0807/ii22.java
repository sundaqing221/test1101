package T0807;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;

class ii22 {
	
	private WebDriver driver;
	private String keyWord;
	@ParameterizedTest
	@CsvSource({ "海南","巴黎水","南非","车厘子" })
	void test1(String keyWord) throws InterruptedException{
		this.keyWord=keyWord; 
		ll.isElement(keyWord);
	}
}
