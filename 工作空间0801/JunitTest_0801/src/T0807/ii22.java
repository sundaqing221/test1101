package T0807;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;

class ii22 {
	
	private WebDriver driver;
	private String keyWord;
	@ParameterizedTest
	@CsvSource({ "����","����ˮ","�Ϸ�","������" })
	void test1(String keyWord) throws InterruptedException{
		this.keyWord=keyWord; 
		ll.isElement(keyWord);
	}
}
