package aug24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountIngg {

	public static void main(String[] args) throws Throwable {
		// write a script to count list box items and print those items
      WebDriver count=new ChromeDriver();
      count.manage().window().maximize();
      count.manage().deleteAllCookies();
      count.get("https://www.amazon.in/amazonprime?ref_=nav_cs_primelink_nonmember");
      //store list box into select class for to access all select class methods
      Select access=new Select(count.findElement(By.id("searchDropdownBox")));
      //get collection of items in a list box
      List<WebElement>all=access.getOptions();
      System.out.println(all.size());
      for (int i = 1; i < all.size(); i++) {
    	  Thread.sleep(200);
    	  System.out.print(i+" ");
		System.out.println(all.get(i).getText());
	}
      count.close();
	}

}
