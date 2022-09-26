package sep01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Between {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().deleteAllCookies();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.location='https://www.opencart.com/index.php?route=common/home'");
        js.executeScript("document.querySelector(\".btn.btn-black.navbar-btn\").click()");
        driver.findElement(By.name("username")).sendKeys("Ajay@hero");
        driver.findElement(By.id("input-firstname")).sendKeys("ajay");
        driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("kumar");
        Thread.sleep(9000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        js.executeScript("document.querySelector(\".btn.btn-primary.btn-lg.hidden-xs\").click()");
        Thread.sleep(5000);
        driver.close();
	}

}
