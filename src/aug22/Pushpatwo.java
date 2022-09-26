package aug22;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pushpatwo {

	public static void main(String[] args) throws Throwable {
		//Creating Instance Object
		WebDriver lion=new ChromeDriver();
		//to maximise the window
		lion.manage().window().maximize();
		//to run browser faster we have to delete all cookies
		lion.manage().deleteAllCookies();
		//Launch Url
		lion.get("https://www.wipro.com/");
		Thread.sleep(6000);
		lion.close();

	}

}
