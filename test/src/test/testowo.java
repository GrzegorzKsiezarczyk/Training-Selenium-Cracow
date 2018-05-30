package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class testowo {
	public static void main(String[] args) {
		WebDriver driver =new SafariDriver();
		driver.get("http://www.google.com");
		System.out.println("testowa zmiana");
		
		
		WebDriver driver1 =new FirefoxDriver();
		driver1.get("http://www.gmail.com");
		
		
		
		WebDriver driver2 =new ChromeDriver();
		driver2.get("http://www.nba.com");
		
	
	}
}
