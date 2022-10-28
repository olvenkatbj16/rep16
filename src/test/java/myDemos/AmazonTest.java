package myDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest 
{
  @Test
  public void aSearch() 
  {
	  	WebDriverManager.chromedriver().browserVersion("105").setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://amazon.in");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("LG");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Reporter.log("Amazon product search test is successful...",true);
  }
}
