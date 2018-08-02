package testing;
import org.testng.annotations.Test;

import page.home;
import page.login;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


 
public class run extends driverchrome{
 
 @Test
 public void start() throws Exception{
 
 driver1.get("https://www.facebook.com");
 login loginpage = PageFactory.initElements(driver1, login.class);
 loginpage.setEmail("ksiakster@gmail.com");
 loginpage.setPassword("HAS.");
 driver1.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
 loginpage.clickLoginButton();
 
 home homepage = PageFactory.initElements(driver1, home.class);
 homepage.clickProfile();
 homepage.verify();
 homepage.clickLogoutLink(); 
 }
}