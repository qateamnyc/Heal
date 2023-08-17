package heal.com.utitlities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetUpDrivers {
	
	public static WebDriver chromedriver;
	
	public static void setUpChromeDriver()
	{
		WebDriverManager.chromedriver().setup();
		chromedriver = new ChromeDriver();
	}
	

	public static WebDriver getChromeDriver() {
		return chromedriver;
	}
	
	public static void quitChrome()
	{
		chromedriver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
