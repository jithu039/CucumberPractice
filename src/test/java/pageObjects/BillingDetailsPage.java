package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BillingDetailsPage {
public WebDriver driver;
	
	public BillingDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='billing_first_name']")
	@CacheLookup
	WebElement btnFirstName;
	
	@FindBy(id="billing_last_name")
	@CacheLookup
	WebElement btnLastName;
	
	@FindBy(id="billing_email")
	@CacheLookup
	WebElement btnEmail;
	
	@FindBy(id="billing_phone")
	@CacheLookup
	WebElement btnPhone;
	
	@FindBy(id="s2id_billing_country")
	@CacheLookup
	WebElement btnCountry;
	
	@FindBy(xpath="//input[@id='billing_address_1']")
	@CacheLookup
	WebElement btnStreet;

	@FindBy(xpath="//input[@id='billing_city']")
	@CacheLookup
	WebElement btnCity;
	
	@FindBy(xpath="//input[@id='s2id_billing_state']")
	@CacheLookup
	WebElement btnState;
	
	@FindBy(xpath="//input[@id='billing_postcode']")
	@CacheLookup
	WebElement btnPostcode;
	
	@FindBy(id="createaccount")
	@CacheLookup
	WebElement RadioCreateAccount;
	
	@FindBy(xpath="//input[@id='payment_method_cod']")
	@CacheLookup
	WebElement RadioCOD;
	
	@FindBy(id="place_order")
	@CacheLookup
	WebElement btnPlaceOrder;
	
	public void SetFirstnmae() {
		btnFirstName.sendKeys("User");
	}
	
	public void SetLastName() {
		btnLastName.sendKeys("User");
	}
	public void SetEmail() {
		btnEmail.sendKeys("User123@gmail.com");
	}
	public void SetPhone() throws InterruptedException {
		btnPhone.sendKeys("9845738223");
		Thread.sleep(3000);
	}
	//Need to select country
	public void SetCountry() {
		btnCountry.click();;
	}
	public void SetStreet() throws InterruptedException {
		btnStreet.sendKeys("london steert");
		Thread.sleep(3000);
	}
	public void SetCity() throws InterruptedException {
		btnCity.sendKeys("london");
		Thread.sleep(3000);
	}
	//Need to select State
	public void SetState() throws InterruptedException {
		btnStreet.sendKeys("london steert");
		Thread.sleep(3000);
	}
	public void SetPostcode() throws InterruptedException {
		btnPostcode.sendKeys("ZE2 9RS");
		Thread.sleep(3000);
	}
	
	public void clkCreateAcc() throws InterruptedException {
		
		RadioCreateAccount.click();
		Thread.sleep(3000);
	}
	public void clkCOD() throws InterruptedException {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", RadioCOD);
        Thread.sleep(3000);
		RadioCOD.click();
		Thread.sleep(3000);
	}
	public void clkPlaceOrder() throws InterruptedException {
		btnPlaceOrder.click();;
		Thread.sleep(3000);
	}

}
