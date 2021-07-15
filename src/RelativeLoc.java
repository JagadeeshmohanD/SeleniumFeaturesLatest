import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;


public class RelativeLoc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   	System.setProperty("webdriver.chrome.driver", "/Users/Jagadeesh Mohan D/Downloads/chromedriver/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
	    
	    WebElement nameEditBox = driver.findElement(By.cssSelector("[name='name']"));
	    System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());
	   
	    WebElement dateofBirth= driver.findElement(By.cssSelector("[for='dateofBirth']"));
	    driver.findElement(withTagName("input").below(dateofBirth)).sendkeys("02/02/1992");
	    
	    WebElement iceCreamLabel=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
	    driver.findElement(withTagName("input").toLeftof(iceCreamLabel)).click();
	    //Get me the Label of first Radio Button
	    WebElement rb= driver.findElement(By.id("inlineRadio1"));
	    System.out.println(driver.findElement(withTagName("input").toRight(rb)).getText());
	}

}
