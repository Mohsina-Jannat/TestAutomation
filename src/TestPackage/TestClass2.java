package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E://Drivers//chromedriver_win32//chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://automationexercise.com/");
		
		
		WebElement homePageTitle=driver.findElement(By.linkText(" Home"));
		
		if(homePageTitle.isDisplayed()) {
			System.out.println("Home Page is displayed");
		}else {
			System.out.println("Homepage is not displayed.");
		}
		
		WebElement viewProduct=driver.findElement(By.linkText("View Product"));
		viewProduct.click();
		
		WebElement productDetails=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]"));
		if(productDetails.isDisplayed()) {
			System.out.println("Product details is showing");
		}else {
			System.out.println("Product details is not showing");
		}
		
		WebElement quantity=driver.findElement(By.id("quantity"));
		quantity.sendKeys("4");
		
		WebElement addToCart=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button"));
		addToCart.click();
		
		WebElement viewCart=driver.findElement(By.linkText("View Cart"));
		viewCart.click();
		
		WebElement cartInfo=driver.findElement(By.id("cart_info"));
		
		if(cartInfo.isDisplayed()) {
			System.out.println("Product is displayed with quantity");
		}else {
			System.out.println("Product is not displayed with quantity");
		}
		
		
		
		
		
		
		
		
		}

}
