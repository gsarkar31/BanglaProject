package ZPracticeProject.ZPracticeProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterMethod;

public class SampleNewTest {
	WebDriver driver;
	WebElement text, display, style;
	
  @Test(priority= 1, enabled = false)
  public void LoginValidationWithInvalidEmail() {
	  
	    driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email_create")).sendKeys("invalidEmail@email");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("SubmitCreate")).click();
		String color = driver.findElement(By.xpath(".//*[@id='email_create']")).getCssValue("background-color");
		System.out.println(color);
		String color2 = Color.fromString(color).asHex();
		System.out.println(color2);
	    String actualResult = "#fff1f2";
	    String expectedResult= color2;
	    if(actualResult.equalsIgnoreCase(expectedResult)){
		  System.out.println("passed");
		  }else
		  {System.out.println("failed");
	  }
  }  
  @Test(priority= 2, enabled = false)
  public void CreateNewAccountWithRegisteredEmail() {
	  driver.findElement(By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
	  driver.findElement(By.xpath(".//*[@id='email_create']")).sendKeys("rabbani@rabbani.com");
	  driver.findElement(By.xpath(".//*[@id='SubmitCreate']")).click();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  String actualResult = "1.An account using this email address has already been registered. Please enter a valid password or request a new one.";
	  System.out.println(actualResult);
	  String expectedResult = "1.An account using this email address has already been registered. Please enter a valid password or request a new one.";
	  if(actualResult.equalsIgnoreCase(expectedResult)){
		  System.out.println("Passed");
	  }else{
		  System.out.println("Failed");
		  
	  }
}
  @Test(priority=3, enabled =true)
  public void CreateNewAccount(){
	  
	  
  }
  
  
  
    
  @BeforeMethod
  public void beforeMethod() {
	 // System.setProperty("webdriver.gecko.driver", "C:\\Users\\Goutam\\Desktop\\Brute force\\Driver\\geckodriver.exe");
	  System.setProperty("webdriver.chrome.driver", "C:\\java\\chromedriver\\chromedriver.exe");
	  driver= new ChromeDriver();
	  //driver= new FirefoxDriver();
	  driver.get("http://ebfs.bruteforcesolution.net/ebfs/index.php");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	  	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
