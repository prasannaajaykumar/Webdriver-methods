package aug20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurreT {

	public static void main(String[] args) throws Throwable {
		WebDriver check=new ChromeDriver();
		check.manage().window().maximize();
		check.manage().deleteAllCookies();
		check.get("https://www.youtube.com/premium");
		Thread.sleep(2000);
		String exp="https";
		String act=check.getCurrentUrl();
		if (act.startsWith(exp)) {
			System.out.println("yes it is secured-->" +exp +act);
		}else {
           System.out.println("no it is not secured-->"+exp  +act );
	}
	check.close();
}}