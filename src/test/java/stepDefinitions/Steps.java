package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import pageObjects.BillingDetailsPage;
import pageObjects.HomePage;
import pageObjects.PracticeSitePage;
import pageObjects.UserRegistrationPage;

public class Steps extends BaseClass {
	
	public WebDriver driver;
	public HomePage hp;
	public UserRegistrationPage usr;
	public PracticeSitePage ps;
	public BillingDetailsPage bd;
	
	
	
	@Given("user launches the browser application")
	public void user_launches_the_browser_application() throws InterruptedException {
		
		System.setProperty("webdrriver.chrome.driveer",System.getProperty("user.dir")+ "//Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    hp = new pageObjects.HomePage(driver);
	    usr = new pageObjects.UserRegistrationPage(driver);
	    ps = new pageObjects.PracticeSitePage(driver);
	    bd = new pageObjects.BillingDetailsPage(driver);
	    ;
	}

	@Given("user landed on the homepage")
	public void user_landed_on_the_homepage() throws InterruptedException {
		driver.get("https://demo.automationtesting.in/FileUpload.html");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() throws InterruptedException {
		hp.ClkRegister();
		Thread.sleep(3000);
	    
	}

	@When("Giving all the details for registration")
	public void Giving_all_the_details_for_registration() throws InterruptedException {
		usr.SetFirstName();
		usr.SetLastname();
		usr.Setemail();
		Thread.sleep(3000);
		usr.SetPhone();
		usr.Setgender1();
		usr.SetHobbie();
		Thread.sleep(3000);
		usr.SetLanguages();
		usr.Setcountry();
		usr.Setyear();
		Thread.sleep(3000);
		usr.Setmonth();
		usr.Setday();
		usr.Setpwd1();
		usr.Setpwd2();
		Thread.sleep(3000);
	}

	@When("clicks on submit")
	public void clicks_on_submit() throws InterruptedException {
		usr.ClkSubmit();
		Thread.sleep(3000);
	    
	}

	@Then("user registration successful")
	public void user_registration_successful() {
		
	    System.out.println("User registration succssful");
	    driver.quit();
	}
	
	@When("user clicks PracticeSite button")
	public void user_clicks_practice_site_button() throws InterruptedException {
			ps.clkPractice();
			
	    }

	@When("user adding products to basket")
	public void user_adding_products_to_basket() throws InterruptedException {
//		Thread.sleep(3000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("aswift_10_host")));
//		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(3000);
		ps.clkAddItem();
	    ps.clkCart();
	}

	@When("user navigate to BasketPage and clicks on checkout button")
	public void user_navigate_to_basket_page_and_clicks_on_checkout_button() throws InterruptedException {
		ps.IncQty();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(3000);
		ps.clkCheckout();
	    
	}

	@When("Giving all the billingdetails for Order")
	public void giving_all_the_billingdetails_for_order() throws InterruptedException {
		bd.SetFirstnmae();
		bd.SetLastName();
		bd.SetEmail();
		bd.SetPhone();
		bd.SetStreet();
		bd.SetCity();
		bd.SetPostcode();
		//bd.clkCreateAcc();
        Thread.sleep(3000);
		//bd.clkCOD();
		Thread.sleep(3000);
		
	}

	@Then("user clicks on placeorder button")
	public void user_clicks_on_placeorder_button() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000);");
        Thread.sleep(3000);
		bd.clkPlaceOrder();
	    
	}


}
