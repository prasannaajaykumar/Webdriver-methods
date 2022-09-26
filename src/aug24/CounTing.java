package aug24;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.Select;

public class CounTing {

	public static void main(String[] args) {
		// script to count and print each and every item in list box
       WebDriver count=new ChromeDriver();
       count.manage().window().maximize();
       count.manage().deleteAllCookies();
       count.get("https://www.amazon.in/amazonprime?ref_=nav_cs_primelink_nonmember");
       //Store list box into select class
       Select list=new Select(count.findElement(By.id("searchDropdownBox")));
       //get collection of items in a list box
       List<WebElement>allitems=list.getOptions();
       System.out.println(allitems.size());
       for (WebElement posi : allitems) {
		System.out.println(posi.getText());
	}
       count.close();
       
	}

}
