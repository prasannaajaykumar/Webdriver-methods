package aug20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KrisHna {

	public static void main(String[] args) {
 // write a script to verify expected titles equals to actual titles
		WebDriver maha=new ChromeDriver();
		maha.manage().window().maximize();
		maha.manage().deleteAllCookies();
		maha.get("https://www.facebook.com/");
		String expected="log in";
		String actual=maha.getTitle();
		if (expected.equalsIgnoreCase(actual)) {
			System.out.println("ok");
		}else {
			System.out.println("no");
			maha.close();
}
	}

}
