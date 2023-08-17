package heal.com.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class heal_Log_in_pageElements {
	@FindBy(xpath = "//*[@id=\"masthead\"]/div[2]/div[3]/ul/li[4]/a/span[1]")
	public WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id=\"masthead\"]/div[2]/div[3]/ul/li[4]/ul/a[1]")
	public  WebElement memberportal;

	@FindBy(xpath = "//*[@id=\"username\"]")
	public WebElement username;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div/div[2]/form/div[4]/button")
	public  WebElement login;

	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div[3]/div[2]/div[2]/form/div[2]/a")
	public  WebElement skipbutton;

	@FindBy(xpath = "//*[@id=\"ReactAppWrapper-wide\"]/div[3]/div/div[3]/div/div[2]/div/div/div/button[1]")
	public WebElement nothanks;
		
	
	
	
	
	
	

}
