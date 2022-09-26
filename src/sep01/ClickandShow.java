package sep01;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickandShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("window.location='http://orangehrm.qedgetech.com/symfony/web/index.php/auth/login'");
         js.executeScript("document.querySelector(\"#txtUsername\").value='Ajay'");
         js.executeScript("document.querySelector(\"#txtPassword\").value='kumar'" );
	}

}
