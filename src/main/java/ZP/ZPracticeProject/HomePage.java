package ZP.ZPracticeProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
WebDriver driver;
By signInLink = By.xpath(".//*[@id='header']/div[2]/div/div/nav/div[1]/a");
	public HomePage(WebDriver aDriver){//constructor
		
		this.driver = aDriver;
	}
	
	public void clickSignInLink(){
		driver.findElement(signInLink).click();
		
	}

}
