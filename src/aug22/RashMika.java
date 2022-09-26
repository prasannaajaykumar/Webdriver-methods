package aug22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class RashMika {
	public static void main(String[] args) throws Throwable {
//WebDriver =new ChromeDriver();
WebDriver tig=new ChromeDriver();
for (int i = 0; i < 20; i++) {
tig.manage().window().maximize();
tig.get("https://www.flipkart.com/");
tig.get("http://primusbank.qedgetech.com/");
tig.get("https://www.facebook.com/");
}
tig.manage().deleteAllCookies();
tig.quit();
}
}