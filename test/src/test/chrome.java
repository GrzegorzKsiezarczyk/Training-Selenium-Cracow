package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chrome {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/bin/chromedriver"); 
		WebDriver driver1=new ChromeDriver();               
        driver1.get("http://www.gmail.com");    
                                                                        
		
	}
}