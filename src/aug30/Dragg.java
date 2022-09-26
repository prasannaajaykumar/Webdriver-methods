package aug30;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Dragg {
	public static void main(String[] args) throws Throwable {
		
		// drag and drop with x and y co-ordinates
	      WebDriver driver=new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().deleteAllCookies();
	      driver.navigate().to("https://jqueryui.com/droppable/");
	      
	      //store frame in a list
	      List<WebElement>frame=driver.findElements(By.tagName("iframe"));
	      System.out.println(frame.size());
	      
	      //switch to frame
	      driver.switchTo().frame(0);
	      WebElement source=driver.findElement(By.id("draggable"));
	      WebElement target= driver.findElement(By.id("droppable"));
	      Actions mou=new Actions(driver);
	      int x,y;
	      x=target.getLocation().getX();
	      y=target.getLocation().getY();
	      System.out.println(x+"  "+y);
	      mou.dragAndDropBy(source, x, y).perform();
	      Thread.sleep(3000);
	      driver.quit();
	}

}
