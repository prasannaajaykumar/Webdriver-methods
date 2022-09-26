package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingjTems {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver sele=new ChromeDriver();
		  sele.manage().window().maximize();
		  sele.manage().deleteAllCookies();
		  sele.get("https://www.facebook.com/");
		  Thread.sleep(5000);
		  sele.findElement(By.partialLinkText("Create New Accou")).click();
		  Thread.sleep(5000);
		  //store list boxes into select class
		  Select bday=new Select(sele.findElement(By.name("birthday_day")));
		  Select bmnth=new Select(sele.findElement(By.name("birthday_month")));
		  Select byear=new Select(sele.findElement(By.name("birthday_year")));
		  //verify any list box is it single or multiple
		  boolean value=bmnth.isMultiple();
		  System.out.println(value);
		  bday.selectByVisibleText("7");
		  bmnth.selectByVisibleText("Oct");
		  byear.selectByIndex(78);
		  Thread.sleep(2000);
		  sele.close();
	}

}
