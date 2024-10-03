package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserRegistrationPage {
	
public WebDriver ldriver;
	
	public UserRegistrationPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='First Name']")
	@CacheLookup
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@placeholder='Last Name']")
	@CacheLookup
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@ng-model='EmailAdress']")
	@CacheLookup
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@ng-model='Phone']")
	@CacheLookup
	WebElement txtPhone;
	
	@FindBy(xpath="//input[@value='Male']")
	@CacheLookup
	WebElement txtGender1;
	
	@FindBy(xpath="//input[@value='FeMale']")
	@CacheLookup
	WebElement txtGender2;
	
	@FindBy(xpath="//input[@id='checkbox1']")
	@CacheLookup
	WebElement sltHobies;
	
	@FindBy(xpath="//div[@id='msdd']")
	@CacheLookup
	WebElement sltLanguage;
	
	@FindBy(xpath="//span[@class='select2-selection select2-selection--single']")
	@CacheLookup
	WebElement sltCountry;
	
	@FindBy(xpath="//select[@id='yearbox']")
	@CacheLookup
	WebElement sltYear;
	
	@FindBy(xpath="//select[@placeholder='Month']")
	@CacheLookup
	WebElement sltMonth;
	
	@FindBy(xpath="//select[@placeholder='Day']")
	@CacheLookup
	WebElement sltDay;
	
	@FindBy(xpath="//input[@id='firstpassword']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='secondpassword']")
	@CacheLookup
	WebElement txtCnfPassword;
	
	@FindBy(id="submitbtn")
	@CacheLookup
	WebElement sltSubmit;
	
	public void SetFirstName() {
		txtFirstname.clear();
		txtFirstname.sendKeys("john");
	}
	
	public void SetLastname() {
		txtLastname.clear();
		txtLastname.sendKeys("user");
		
	}
	
	public void Setemail() {
		txtEmailAddress.clear();
		txtEmailAddress.sendKeys("user12@user.com");
	}
	
	public void SetPhone() {
		txtPhone.clear();
		txtPhone.sendKeys("9823758389");
	}
	
	public void Setgender1() {
		txtGender1.click();
	}
	
	public void Setgender2() {
		txtGender2.click();
	}
	
	public void SetHobbie() {
		sltHobies.click();
	}
	
	public void SetLanguages() {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value = 'English'", sltLanguage);
	}
	
	public void Setcountry() {
		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].value = 'English'", sltCountry);
		
	}
	
	public void Setyear() {
		selectOption(sltYear,"2000");
//		Select select1 = new Select(sltYear);
//		select1.selectByVisibleText("2000");
	}
	
	public void Setmonth() {
		selectOption(sltMonth,"March");
//		Select select2 = new Select(sltMonth);
//		select2.selectByVisibleText("March");
	}
	
	public void Setday() {
		selectOption(sltDay,"10");
//		Select select3 = new Select(sltDay);
//		select3.selectByVisibleText("10");
	}
	
	public void Setpwd1() {
		txtPassword.clear();
		txtPassword.sendKeys("User@1234");
	}
	
	public void Setpwd2() {
		txtCnfPassword.clear();
		txtCnfPassword.sendKeys("User234");
	}
	
	public void ClkSubmit() {
		sltSubmit.click();
	}
	
	public void selectOption(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
}
