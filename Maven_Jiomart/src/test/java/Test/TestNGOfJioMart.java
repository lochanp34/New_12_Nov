package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import Maven_Jiomart.HomePageOfJiomart;
import Maven_Jiomart.ProductPageJiomart;

public class TestNGOfJioMart {
	
 WebDriver driver;
 
 	@BeforeClass 
	public void OpenBrowser() {
	System.out.println("Before Class");

    System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayur\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    ChromeOptions ops =  new ChromeOptions();
    ops.addArguments("--remote-allow-origins=*");
     driver = new ChromeDriver (ops);
     driver.manage().window().maximize();
     driver . manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
	}
	@BeforeMethod
	public void GotoProductPage () {
    System.out.println("Before Method");
    driver = new ChromeDriver();
    driver . get ("https://www.jiomart.com");
    HomePageOfJiomart homePageOfJiomart = new HomePageOfJiomart(driver);
    homePageOfJiomart.moveOnGroceries();
    homePageOfJiomart.moveOnDairyBakery();
    homePageOfJiomart.clickOnbakedcookies1();
    
	}
	@Test
	public void VerifyBakedCookiesProductPgeUrl() {
    System.out.println("Test 1");
    ProductPageJiomart ProductPageJiomart = new ProductPageJiomart(driver);
    String Actualurl =ProductPageJiomart.GetCurrentUrl();
    String Expectedurl="https://www.jiomart.com/c/groceries/dairy-bakery/baked-cookies/273";
    if  (Actualurl.equals(Expectedurl)) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
		}
	
    
    
    
    }
	
	@AfterMethod
	public void GoToResultPage() {
		System.out.println("After Method");
		
	}
	
	@AfterClass
	public void OpenResult() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("Before Suite");
	}
	

}

