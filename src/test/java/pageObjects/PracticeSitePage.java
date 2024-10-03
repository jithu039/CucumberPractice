package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeSitePage {
	public WebDriver driver;
	
	public PracticeSitePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Practice Site']")
	@CacheLookup
	WebElement btnPractice;
	
	@FindBy(xpath="//*[@data-product_id='165']")
	@CacheLookup
	WebElement btnAdd;
	
	@FindBy(xpath="//a[@title='View your shopping cart']")
	@CacheLookup
	WebElement btnCart;
	
	@FindBy(xpath="//input[@type='number']")
	@CacheLookup
	WebElement btnQty;
	
	@FindBy(xpath="//*[@class=\"checkout-button button alt wc-forward\"]")
	@CacheLookup
	WebElement btnCheckout;
	
	public void clkPractice() throws InterruptedException{
		btnPractice.click();
		Thread.sleep(3000);
		
	}
	public void clkAddItem() throws InterruptedException{
		btnAdd.click();
		Thread.sleep(3000);
		
	}
	public void clkCart() throws InterruptedException{
		btnCart.click();
		Thread.sleep(3000);
		
	}
	public void IncQty() throws InterruptedException{
		btnQty.sendKeys("3");
		Thread.sleep(3000);
		
	}
	public void clkCheckout() throws InterruptedException{
		btnCheckout.click();;
		Thread.sleep(3000);
		
	}
	

}
