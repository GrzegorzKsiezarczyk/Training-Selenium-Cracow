package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class runjunit extends driverchrome{
    @BeforeEach()
    public void BeforeEach()
    {
 
    }
    
    @AfterEach()
    public void AfterEach()
    {
 
    }
    
    @BeforeAll()
    public static void BeforeAll()
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }
    
    @AfterAll()
    public static void AfterAll()
    {
        driver1.quit();
    }
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
