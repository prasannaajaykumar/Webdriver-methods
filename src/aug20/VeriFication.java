package aug20;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeriFication {

	public static void main(String[] args) throws Throwable {
		WebDriver ver=new ChromeDriver();
		ver.manage().window().maximize();
		ver.manage().deleteAllCookies();
		ver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login");
		WebElement user=ver.findElement(By.cssSelector("#txtUsername"));
		user.clear();
		user.sendKeys("admin");
        String username=user.getAttribute("value");
        System.out.println(username);
        WebElement pass=ver.findElement(By.cssSelector("#txtPassword"));
        pass.clear();
        pass.sendKeys("Qedge123@#");
        String password=pass.getAttribute("value");
        System.out.println(password);
        ver.findElement(By.cssSelector("#btnLogin")).sendKeys(Keys.ENTER);;
        Thread.sleep(2000);
        String expected="dashboard";
        String actual=ver.getCurrentUrl();
        if (actual.contains(expected)) {
			System.out.println("Login success::"+expected+"  "+actual);
		}else
		{
			String Errormsg=ver.findElement(By.cssSelector("#spanMessage")).getText();
			System.out.println(Errormsg+ "    "+expected+"    "+actual);
		}
        ver.close();
	}

}
