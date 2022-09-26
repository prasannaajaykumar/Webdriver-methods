package aug30;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable {
		// script to use Context click 
		WebDriver ryt=new ChromeDriver();
		ryt.manage().window().maximize();
		ryt.manage().deleteAllCookies();
		ryt.navigate().to("https://www.google.co.in/");
		Thread.sleep(3000);
        Actions key=new Actions(ryt);
        key.moveToElement(ryt.findElement(By.linkText("Gmail"))).contextClick().perform();
        Thread.sleep(3000);
        //create a robot object for to handle window related 
        Robot h=new Robot();
        h.keyPress(KeyEvent.VK_DOWN);
        h.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        h.keyPress(KeyEvent.VK_DOWN);
        h.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(3000);
        h.keyPress(KeyEvent.VK_ENTER);
        ArrayList<String> bmw=new ArrayList<String>(ryt.getWindowHandles());
        System.out.println(bmw.size());
        
        //switch to child window
        ryt.switchTo().window(bmw.get(1));
        
        //click on create account
        ryt.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[3]/span[2]")).click();
        Thread.sleep(5000);
        
        //switch to parent window 
        ryt.switchTo().window(bmw.get(0));
        ryt.findElement(By.linkText("Images")).click();
        ryt.quit();
	}

}
