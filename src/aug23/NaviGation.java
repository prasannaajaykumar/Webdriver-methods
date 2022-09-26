package aug23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaviGation {

	public static void main(String[] args) throws Throwable {
		//navigation commands
WebDriver navi=new ChromeDriver();
navi.manage().window().maximize();
navi.manage().deleteAllCookies();
navi.navigate().to("https://www.google.co.in/");
Thread.sleep(5000);
System.out.println("pagetitle(1)   "+navi.getTitle());
//click on gmail link
navi.findElement(By.partialLinkText("Gmail")).click();
System.out.println("pagetitle(2)   "+navi.getTitle());
Thread.sleep(5000);
//click on back button
navi.navigate().back();
Thread.sleep(5000);
System.out.println("pagetitle(3)   "+navi.getTitle());
//click on forward button
navi.navigate().forward();
System.out.println("pagetitle(4)   "+navi.getTitle());
Thread.sleep(5000);
navi.navigate().refresh();
navi.close();
	}

}
