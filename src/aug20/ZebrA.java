package aug20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class ZebrA {
	public static void main(String[] args) throws Throwable {
		//Write a script to login to primus bank 
		//Create instance object
		WebDriver zoya=new ChromeDriver();
		zoya.manage().window().maximize();
		zoya.manage().deleteAllCookies();
		//launch url
		zoya.get("https://www.facebook.com/");
	    Thread.sleep(5000);
	    //enter login details
	    zoya.findElement(By.name("email")).sendKeys("9542917637");
	    zoya.findElement(By.name("pass")).sendKeys("CHEPANU");
	    zoya.findElement(By.name("login")).sendKeys(Keys.ENTER);
	    Thread.sleep(9000);
	    zoya.close();
	
	}

}
