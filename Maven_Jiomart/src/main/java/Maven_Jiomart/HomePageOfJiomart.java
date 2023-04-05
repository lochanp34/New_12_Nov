package Maven_Jiomart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageOfJiomart {
	//Variable Declaration
	
	@FindBy(xpath="//div//p")
	private WebElement text;
	
	@FindBy(xpath="//a[text()= 'Groceries']")
	private WebElement groceries;

	@FindBy(xpath="//a[text()='Dairy & Bakery']")
	private WebElement dairyBakery;
	
	@FindBy(xpath=" //a[text()='Baked Cookies']")
	private WebElement bakedCookies;
	 
         WebDriver driver;
	  	//Actions actions;
	
	
	//Variable initialization
	public HomePageOfJiomart(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver = driver;

	}
	//variable use
	public String getTextMassage() {
		String s = text.getText();
		return s;
	}
	
	   Actions actions;
	public void moveOnGroceries() {
		Actions actions = new Actions (driver);
		actions.moveToElement(groceries);
		actions.perform();
		actions.build();
	}
	
	public void moveOnDairyBakery() {
		Actions actions = new Actions (driver);
		actions.moveToElement(dairyBakery);
		actions.perform();
		actions.build();
		
		
	}
	
	public void clickOnbakedcookies1() {
		bakedCookies.click();
	
	}


		
	}

	
	
	
	
	 
//    WebElement Groceries = driver.findElement(By.xpath("//a[text()= 'Groceries']"));
//  Actions act1 = new Actions(driver);
//  act1. moveToElement(Groceries).perform();
//  
////  Thread.sleep(1000);
////a[text()='Dairy & Bakery']
//  WebElement Dairy = driver.findElement(By.xpath("//a[text()='Dairy & Bakery']"));
//  act1. moveToElement(Dairy).perform();

