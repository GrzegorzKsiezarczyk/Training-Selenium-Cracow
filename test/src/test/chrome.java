package test;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.TakesScreenshot;



public class chrome {
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/bin/chromedriver"); 
		WebDriver driver1=new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver1, 10);
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
		
		
        driver1.get("http://www.google.com");    
        WebElement searchfield = driver1.findElement(By.id("lst-ib"));      //search element with Id                                                        
		searchfield.sendKeys("facebook");                                   //send text to google
        searchfield.submit();     //accept 
        
        WebElement foto = driver1.findElement(By.linkText("Facebook – zaloguj się lub zarejestruj"));
        foto.click();                   //click on facebook, using lintText
        
       
        //css selector

        //Find first name text box by CSS Selector
        driver1.navigate().to("https://www.linkedin.com/");
        WebElement firstNameTextBox = driver1.findElement(By.cssSelector(".reg-firstname"));
        firstNameTextBox.click();
        firstNameTextBox.sendKeys("Grzegorz");
        
        //xpath
        WebElement SurNameTextBox = driver1.findElement(By.xpath("//*[@id='reg-lastname']"));// xpath selector
        //SurNameTextBox.click();
        SurNameTextBox.sendKeys("Księciu");
        
        //screenshot
      
        try{
		  driver1.findElement(By.id("testing")).sendKeys("test");
             
       
	  }
	  catch (Exception e){
		  System.out.println("I'm in exception");
		  getscreenshot();
 	  }
        
       
        
	}

	private static void getscreenshot() throws IOException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/bin/chromedriver"); 
		WebDriver driver=new ChromeDriver();
	     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(scrFile, new File("/Users/grzegorzksiezarczyk/Documents/foto/screen1.png"));
	}}
        
        
