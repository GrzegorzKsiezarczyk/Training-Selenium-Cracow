package test;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class chrome {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/bin/chromedriver"); 
		WebDriver driver1=new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver1, 10);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		
		
        driver1.get("http://www.google.com");    
        WebElement searchfield = driver1.findElement(By.id("lst-ib"));      //search element with Id                                                        
		searchfield.sendKeys("facebook");                       //send text to google
        searchfield.submit();     //accept 
        
        WebElement foto = driver1.findElement(By.linkText("Facebook – zaloguj się lub zarejestruj"));
        foto.click();                   //click on facebook
        
       
        //css selector

        //Find first name text box by CSS Selector
        driver1.navigate().to("https://www.linkedin.com/");
        WebElement firstNameTextBox = driver1.findElement(By.cssSelector("#first-name"));
        firstNameTextBox.click();
        
        
        
        
        
	}}
        
        
