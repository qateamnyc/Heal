package heal.com.pageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import heal.com.pageElements.heal_accountcreate_pageElements;

public class heal_accountcreate_pageAction {

		heal_accountcreate_pageElements pageElements;
		
		public heal_accountcreate_pageAction() {
			
			pageElements = new heal_accountcreate_pageElements();
			PageFactory.initElements(DriverSetup.driver, pageElements);
			
		}
public void gethealthfirsthomepage() {
	DriverSetup.driver.get("https://healthfirst.org/");
	DriverSetup.driver.manage().window().maximize();
	
}
public void clickloginbutton() {
	pageElements.loginbutton.click();
}

public void clickmemberportal() {
	pageElements.memberportal.click();
}
public void clickcreateaccount() {
	pageElements.CreateAccount.click();
	
}
public void selectActivateCoverage() {
	pageElements.ActivateCoverage.click();
}
public void clickcontinuebutton() {
	pageElements.Continuebutton.click();
}
public void enterfirstname() {
	pageElements.FirstName.sendKeys("nikita");
}	
public void enterDateofBirth() {
	pageElements.DateOfBirth.sendKeys("0820");
}	
public void enterMobileNumber() {
	pageElements.MobileNumber.sendKeys("9172345678");
}
public void enterEmailAdd() {
	pageElements.EmailAddress.sendKeys("nikita@gmail.com");
}	
public void reEnterEmailAdd() {
	pageElements.ReenterEmail.sendKeys("nikita@gmail.com");
}
public void selectAwkknowledbox() {
	pageElements.selectackkowlgecheckbox.click();
}
public void clickcontinue() {
	pageElements.clickcontinueagain.click();
}
public void clickEmailMe() {
	pageElements.TickEmailMe.click();
}
public void clicksendcodebutton() {
	pageElements.sendcode.click();
}
}