package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox {
	public static void main(String[] args) {
		                                                                        
		
		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir")+"/bin/geckodriver");                          
		WebDriver driver2 =new FirefoxDriver();
		driver2.get("http://www.nba.com");

		
	}
}