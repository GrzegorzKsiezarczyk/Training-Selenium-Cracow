package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.URL;

/**
* Example to show how to use XPath in Selenium test.
* @author JavaCodeGekks.com
*/
public class usexpath {

  public static void main(String args[]) throws Exception {
	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/bin/chromedriver"); 
	WebDriver driver=new ChromeDriver();    
    driver.get("http://www.javacodegeeks.com");
    WebElement element = driver.findElement(By.xpath("/html/body[@class='home blog gecko']/div[@id='wrapper']/div[@id='bottom']/div[1]/a[@class='ext-link']"));
    System.out.println(element.getText());
    System.out.println("Page title is: " + driver.getTitle());
    driver.quit();
  }
}