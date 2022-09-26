package aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws Throwable {
		//script for keyboard actions
       WebDriver act=new ChromeDriver();
       act.manage().window().maximize();
       act.manage().deleteAllCookies();
       act.navigate().to("https://www.flipkart.com/");
       Actions sj=new Actions(act);
       sj.sendKeys(Keys.ESCAPE).perform();
       act.findElement(By.name("q")).sendKeys("t-shirts");
       Thread.sleep(5000);
       //press down arrow in keyboard two times
       sj.sendKeys(Keys.ARROW_DOWN).perform();
       Thread.sleep(5000);
       sj.sendKeys(Keys.ARROW_DOWN).perform();
       Thread.sleep(5000);
       sj.sendKeys(Keys.ARROW_UP).perform();
       Thread.sleep(5000);
       sj.sendKeys(Keys.ENTER).perform();
       Thread.sleep(5000);
       act.close();
	}

}
