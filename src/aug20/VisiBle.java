package aug20;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VisiBle {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:\\PROJECT TESTING\\webdriver project\\geckodriver.exe");
		WebDriver jike=new ChromeDriver();
		//jike.manage().window().maximize();
		jike.manage().deleteAllCookies();
		jike.get("https://www.google.co.in/");
        Thread.sleep(2000);
        //capture text
		String chudu=jike.findElement(By.linkText("Gmail")).getText();
		System.out.println(chudu);
		//capture url
		String nen=jike.findElement(By.partialLinkText("Gmail")).getAttribute("href");
		System.out.println(nen);
		jike.close();
	}
}
