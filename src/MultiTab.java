import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Jagadeesh Mohan D/Downloads/chromedriver/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
	    driver.switchTo().newWindow(WindowType.TAB);
	    //get control on new Tab
	    Set<String> handels=driver.getWindowHandles();
	    Iterator<String> it=handels.iterator();
	    String parentWindowId = it.next();
	    String childWindow=it.next();
	    driver.switchTo().window(childWindow);
	    driver.get("https://rahulshettyacademy.com/");
	    String courseName=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(5).getText();
	    driver.switchTo().window(parentWindowId);
	    driver.findElement(By.cssSelector("[name='name']")).sendKeys(courseName);
	    System.out.println(courseName);
	    driver.quit();
	}

}
