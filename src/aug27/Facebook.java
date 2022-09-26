package aug27;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Throwable {
		// radio button test
        WebDriver radio=new ChromeDriver();
        radio.manage().window().maximize();
        radio.manage().deleteAllCookies();
        radio.get("https://www.facebook.com/");
        Thread.sleep(5000);
        radio.findElement(By.linkText("Create New Account")).click();
        ArrayList<String>brw=new ArrayList<String>(radio.getWindowHandles());
        radio.switchTo().window(brw.get(1));
        List<WebElement>sto=radio.findElements(By.xpath("//label[@class='_58mt']"));
        System.out.println(sto.size());
        for (WebElement ui : sto) {
			System.out.println(ui.getText());      
        }
		radio.quit();
		}
	}


