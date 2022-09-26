package sep03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
public class Facerook {


		    public static void  main(String[] args) throws Throwable{
		    	
		        WebDriver driver = new ChromeDriver();

		        driver.get("https://www.facebook.com");
		        System.out.println("Successfully opened the website");
		        driver.manage().window().maximize();
		        driver.findElement(By.id("email")).sendKeys("9542917637");
		        driver.findElement(By.id("pass")).sendKeys("marchipoya123");
		        driver.findElement(By.name("login")).click();
		        System.out.println("Successfully logged in");
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("(//*[name()='image'])[1]")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//span[normalize-space()='Log Out']")).click();
		        Thread.sleep(2000);
		        System.out.println("Successfully logged out");
		        driver.close();

		    }
	}

