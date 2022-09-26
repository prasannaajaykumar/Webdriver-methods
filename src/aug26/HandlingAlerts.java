package aug26;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingAlerts {
	public static void main(String[] args) throws Throwable {
	
		//write a script to capture alert text by capturing alert message
    WebDriver cap=new ChromeDriver();
    cap.manage().window().maximize();
    cap.manage().deleteAllCookies();
    cap.get("https://www.rediff.com/");
    cap.findElement(By.linkText("Rediffmail")).click();
    Thread.sleep(2000);
    String ti=cap.getTitle();
    System.out.println(ti);
    cap.findElement(By.name("proceed")).click();
    //capture alert text
    String alertmsg=cap.switchTo().alert().getText();
    System.out.println(alertmsg);
    //click OK on alert window
    cap.switchTo().alert().accept();
    cap.close();
	}

}
