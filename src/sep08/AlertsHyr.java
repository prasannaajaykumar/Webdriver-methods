 package sep08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsHyr {
	public static void main(String[] args) throws InterruptedException{
	// handling alerts by using webdriver methods
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.manage().deleteAllCookies();
     driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");
     driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
     
     //alert box
     driver.findElement(By.xpath("//button[@id='alertBox']")).click();
     String alertm=driver.switchTo().alert().getText();
     System.out.println(alertm);
     driver.switchTo().alert().accept();
     WebElement output=driver.findElement(By.xpath("//div[@id='output']"));
     String youcli=output.getText();
     System.out.println(youcli);
     
     //confirm box
     driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
     String msg=driver.switchTo().alert().getText();
     System.out.println(msg);
     driver.switchTo().alert().dismiss();
     String you=output.getText();
     System.out.println(you);
    
     //prompt box
     WebDriverWait wait=new WebDriverWait(driver, 20);
     wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='promptFunction()']")));
     driver.findElement(By.xpath("//button[@id='promptBox']")).click();
     String alr=driver.switchTo().alert().getText();
     System.out.println(alr);
     driver.switchTo().alert().sendKeys("Ajay");
     driver.switchTo().alert().accept();
     String yo=output.getText();
     System.out.println(yo);
     driver.close();
	}

}
