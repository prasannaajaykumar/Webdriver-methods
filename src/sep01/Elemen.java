package sep01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elemen {

	public static void main(String[] args) throws Throwable {
		//scroll to certain element in a webpage
		WebDriver driver=new ChromeDriver();
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.location='https://www.opencart.com/index.php?route=common/home'");
       Thread.sleep(5000);
       WebElement elem=driver.findElement(By.cssSelector(".btn.btn-ghost-dark.btn-lg.hidden-xs"));
       js.executeScript("document.scrollIntoView",elem);
       Thread.sleep(5000);
       elem.click();
       Thread.sleep(5000);
       driver.quit();;
	}

}
