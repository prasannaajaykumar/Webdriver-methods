package aug20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinks {

	public static void main(String[] args) throws Throwable {
		// write a program by using tagname and gettext and attributes
    WebDriver collect=new ChromeDriver();
    collect.manage().window().maximize();
	collect.manage().deleteAllCookies();
	collect.get("https://www.facebook.com/");
	Thread.sleep(5000);

	//get collection of links in a webpage which are stored into html tag a
    List<WebElement>alllinks=collect.findElements(By.tagName("a"));
	System.out.println("no,of links are::"+alllinks.size());
	
	//iterate all links
	for (WebElement each : alllinks) {
	//print each link text
	String linkname=each.getText();
	System.out.println(linkname);
}   collect.close();
	}

}
