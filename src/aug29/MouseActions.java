package aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws Throwable {
		//script to perform actions in flipkart
       WebDriver fp=new ChromeDriver();
       fp.manage().window().maximize();
       fp.manage().deleteAllCookies();
       fp.navigate().to("https://www.flipkart.com/");
       Thread.sleep(5000);
       Actions bn=new Actions(fp);
       bn.sendKeys(Keys.ESCAPE).perform();
       bn.moveToElement(fp.findElement(By.xpath("//div[contains(text(),'Fashion')]"))).perform();
       Thread.sleep(5000);
       bn.moveToElement(fp.findElement(By.linkText("All"))).click().perform();
       Thread.sleep(5000);
       bn.moveToElement(fp.findElement(By.xpath("//span[normalize-space()='Electronics']"))).perform();
       Thread.sleep(5000);
       bn.moveToElement(fp.findElement(By.linkText("Vivo"))).click().perform();
       Thread.sleep(5000);
	}

}
