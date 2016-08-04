package findyou.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenWebSite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		// …Ë÷√ chrome µƒ¬∑æ∂  
        System.setProperty("webdriver.chrome.driver", "D:\\workspace\\drivers\\chromedriver.exe");  
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.baidu.com");
	}

}
