package Maven_Jiomart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productInformationPage {
	@FindBy (xpath="(//div[text()=' Sarwar Panko Bread Crumbs 500 Grams. '])[1]")
    private WebElement Text;
	
    @FindBy (xpath="(//button)[2]")
    private WebElement addToCrd;
    
	//Variable initialization
	public productInformationPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	public String getTextMassage() {
		String s = Text.getText();
		return s;
	}
	
	public void clickOnAddToCardButton() {
		addToCrd.click();	
	}	
}//(//div[text()=' Sarwar Panko Bread Crumbs 500 Grams. '])[1]