package aug29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyBoar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		Thread.sleep(3000);
	    WebElement drop=driver.findElement(By.id("searchDropdownBox"));
		drop.sendKeys("j");
		Thread.sleep(5000);
		Actions down=new Actions(driver);
		down.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		down.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		down.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(5000);
		driver.close();
	}
}
