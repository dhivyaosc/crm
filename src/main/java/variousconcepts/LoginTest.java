package variousconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	

	public static void main(String[] args) {
		//create object 
		
     WebDriver driver =new ChromeDriver();
     // delete all cookies
     driver.manage().deleteAllCookies();
     // go to website
     driver.get("https://techfios.com/billing/?ng=dashboard/");
     //maximize
     driver.manage().window().maximize();
     //insert username
     driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
     //insert password
     driver.findElement(By.id("password")).sendKeys("abc123");
     //Click in login button

     driver.findElement(By.name("login")).click();
     //close 
     driver.close();
	}

}
