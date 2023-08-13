package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E://Drivers//chromedriver_win32//chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://automationexercise.com/");
		
		WebElement homePageTitle=driver.findElement(By.linkText(" Home"));
		
		if(homePageTitle.isDisplayed()) {
			System.out.println("Home Page is displayed");
		}else {
			System.out.println("Homepage is not displayed.");
		}
		
		WebElement products=driver.findElement(By.linkText(" Products"));
		products.click();
		
		String expectedTitle= "ALL PRODUCTS";
		String actualTitle=driver.getTitle();
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("All product page is displayed");
		}else {
			System.out.println("All product page is not displayed");
		}
		
		WebElement search=driver.findElement(By.id("search_product"));
		search.sendKeys("Men");
		
		WebElement searchButton=driver.findElement(By.id("submit_search"));
		searchButton.click();
		
		String expectedSearchProductTitle="SEARCHED PRODUCTS";
		String actualSearchTitle=driver.getTitle();
		
		if(actualSearchTitle.equals(expectedSearchProductTitle)) {
			System.out.println("Searched Products Are Displayed");
		}else {
			System.out.println("Searched Products Are not Displayed");
		}
		
		WebElement featuredItems=driver.findElement(By.xpath("/html/body/section[2]/div/div/div[2]/div"));
		if(featuredItems.isDisplayed()) {
			System.out.println("All Search Products are visible");
		}else {
			System.out.println("All Search Products are not visible");
		}
		
	

	}

}
