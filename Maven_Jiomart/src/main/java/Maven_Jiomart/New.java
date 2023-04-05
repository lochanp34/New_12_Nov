package Maven_Jiomart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New {	public static void main(String[] args) throws InterruptedException {

	//System.setProperty("webdriver.driver.chromedriver",""C:\Users\Mayur\Downloads\chromedriver_win32 (1)\chromedriver.exe"");

	System.setProperty("webdriver.firefox.bin","C:\\Users\\Mayur\\Downloads\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
	//ChromeOptions ops =  new ChromeOptions();
    //ops.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new FirefoxDriver();
	driver. get("https://www.facebook.com");
}
}