import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v91.emulation.Emulation;

public class MobileEmulatorTest {
 
   public static void main(String[] args) throws InterruptedException{
   	// TODO Auto-generated method stub
   	
   	System.setProperty("webdriver.chrome.driver", "/Users/Jagadeesh Mohan D/Downloads/chromedriver/chromedriver.exe");
    
    ChromeDriver driver = new ChromeDriver();
    
    DevTools devTools = driver.getDevTools();
    
    devTools.createSession();
    
    //sends command to CDP method->CDP Method will invoke chrome browser as mobile screen
    devTools.send(Emulation.setDeviceMetricsOverride(600,1000,50,true, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty()
    		, Optional.empty(), Optional.empty()));
    
    driver.get("https://rahulshettyacademy.com/angularAppdemo/");
    
    driver.findElement(By.cssSelector(".navbar-toggler")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.linkText("Library")).click();
    //Network.getRequestPostData
    
    
   }
}