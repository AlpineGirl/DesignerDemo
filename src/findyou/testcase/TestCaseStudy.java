package findyou.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseStudy {
	// TODO Auto-generated method stub
//			System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//			// …Ë÷√ chrome µƒ¬∑æ∂  
//	        //System.setProperty("webdriver.chrome.driver", "C:\\Documents and Settings\\sq\\Local Settings\\Application Data\\Google\\Chrome\\Application\\chrome.exe");  
//			WebDriver dr = new FirefoxDriver();
//			dr.get("http://www.baidu.com");
			
	// test case 1
    @Test
    public void testCase1() {
        System.out.println("This is a test case 1");
    }

    // test case 2
    @Test
    public void testCase2() {
        System.out.println("This is a test case 2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is beforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This is afterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This is beforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This is afterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This is beforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This is afterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This is beforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This is afterSuite");
    }
}
