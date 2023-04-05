package Maven_Jiomart;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageJiomart {
//	@FindBy(xpath="//a[text()='Baked Cookies']")
//	private WebElement bakedCookies ;
	
	@FindBy(xpath="(//a//div//div//div)[38]")
	private WebElement coconutPowder ;

	private WebDriver driver;
	
	
	//Variable initialization
	public ProductPageJiomart(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = driver;
	}
	
//	public void clickOnbakedcookies1() throws InterruptedException {
//		bakedCookies.click();
//		 
	public void clickOnCoconutPowder() throws InterruptedException {
		Thread .sleep(1000);
	      JavascriptExecutor js = (JavascriptExecutor) driver;
	      js .executeScript("window.scrollBy(200,850)");
		coconutPowder.click();
	     
	 }
	
	public String GetCurrentUrl() {
	String url =	driver.getCurrentUrl();
	return url;
	//https://www.jiomart.com/c/groceries/dairy-bakery/baked-cookies/273
	//https://www.jiomart.com/p/groceries/sarwar-panko-bread-crumbs-500-grams/596397530
	}

	
	
}
