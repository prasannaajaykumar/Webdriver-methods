package aug22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DaughTer {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver vig=new ChromeDriver();
vig.manage().window().maximize();
vig.manage().deleteAllCookies();
vig.get("https://www.google.com/");
vig.findElement(By.xpath("//input[@title='Search']")).sendKeys("Happy birthday");
vig.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).sendKeys(Keys.ENTER);
Thread.sleep(5000);
vig.close();
	}

}
