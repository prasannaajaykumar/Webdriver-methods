package aug30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickandHold {

	public static void main(String[] args) throws Throwable {
		//script for drag and drop
    WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.navigate().to("https://jqueryui.com/droppable/");
    Thread.sleep(2000);
    
    //get collection of frames
    List<WebElement>fr=driver.findElements(By.tagName("iframe"));
    System.out.println(fr.size());
    
    //for mouse operations we are creating actions object
    Actions obj=new Actions(driver);
    
    //switch to frame
    driver.switchTo().frame(0);
    WebElement source=driver.findElement(By.id("draggable"));
    WebElement target=driver.findElement(By.id("droppable"));
    obj.clickAndHold(source).moveToElement(target).release().perform();
    
    //come out of frame and switch to main page
    driver.switchTo().defaultContent();
    Thread.sleep(3000);
    driver.findElement(By.linkText("Autocomplete")).click();
    Thread.sleep(3000);
    driver.quit();
	}

}
