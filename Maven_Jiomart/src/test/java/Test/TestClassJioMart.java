package Test;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Maven_Jiomart.ProductPageJiomart;
import Maven_Jiomart.HomePageOfJiomart;
import Maven_Jiomart.productInformationPage;

public class TestClassJioMart {
	  //private static final TimeUnit TimeUnit = null;

	public static void main(String[] args) throws InterruptedException { 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Mayur\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			ChromeOptions ops =  new ChromeOptions();
		    ops.addArguments("--remote-allow-origins=*");
		    WebDriver driver = new ChromeDriver ();
		     Thread.sleep(2000);
			 driver . get ("https://www.jiomart.com");
		     
			 driver.manage().window().maximize();
		     driver . manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		   
		  Thread.sleep(2000);
		  HomePageOfJiomart homePageOfJiomart = new HomePageOfJiomart (driver);
		  homePageOfJiomart.moveOnGroceries();
		  Thread.sleep(3000);
          homePageOfJiomart.moveOnDairyBakery(); 
          //Thread.sleep(3000);
          homePageOfJiomart.clickOnbakedcookies1();		    
//
	     ProductPageJiomart productPageJiomart = new ProductPageJiomart(driver);
//	     productPageJiomart.clickOnbakedcookies1();
	     productPageJiomart.clickOnCoconutPowder();
	     productPageJiomart.GetCurrentUrl();
	     
	     Thread.sleep(2000);
	     
	    productInformationPage productinformationpage = new productInformationPage (driver);
	     productinformationpage.getTextMassage();
	  }
}     