package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {
	
	public static void main(String args[]) throws InterruptedException {
		 
		WebDriver driver ;
		System.setProperty("webdrriver.chrome.driveer",System.getProperty("user.dir")+ "//Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement Interaction = driver.findElement(By.xpath("//*[@href='Interactions.html']"));
		Actions action = new Actions(driver);
		action.moveToElement(Interaction).build().perform();
		Thread.sleep(2000);
		WebElement Move1 = driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop']"));
		action.moveToElement(Move1).build().perform();
		Thread.sleep(2000);
		WebElement Move2 = driver.findElement(By.xpath("//*[@href='Static.html']"));
		action.moveToElement(Move2).click().build().perform();
		WebElement drag1 = driver.findElement(By.xpath("//*[@id='angular']"));
		Thread.sleep(3000);
		WebElement drag2 = driver.findElement(By.id("droparea"));
		action.dragAndDrop(drag1, drag2).build().perform();
		Thread.sleep(5000);
		driver.quit();
		

		
		
		
	}

}
