package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectingItems {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
  WebDriver sele=new ChromeDriver();
  sele.manage().window().maximize();
  sele.manage().deleteAllCookies();
  sele.get("https://www.facebook.com/");
  Thread.sleep(5000);  
  sele.findElement(By.partialLinkText("Create New Accou")).click();
  Thread.sleep(5000);
  sele.findElement(By.name("birthday_day")).sendKeys("20");
  sele.findElement(By.name("birthday_month")).sendKeys("mar");
  sele.findElement(By.name("birthday_year")).sendKeys("1998");
  //verify any list box that is single or multiple selection
	}
	

}
