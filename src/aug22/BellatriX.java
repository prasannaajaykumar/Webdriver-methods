package aug22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BellatriX {

	public static void main(String[] args) throws Throwable {
		// write a script to print title and current url along with length
WebDriver krishna=new ChromeDriver();
krishna.manage().window().maximize();
krishna.manage().deleteAllCookies();
krishna.get("https://www.facebook.com/");
Thread.sleep(5000);
//print title and length of the title
String Title=krishna.getTitle();
System.out.println(Title);
System.out.println(Title.length());
String hu=krishna.getCurrentUrl();
System.out.println(hu);
System.out.println(hu.length());
krishna.close();
	}

}
