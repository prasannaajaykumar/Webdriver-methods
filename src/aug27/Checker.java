package aug27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checker {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
        WebDriver che=new ChromeDriver();
        che.manage().window().maximize();
        che.manage().deleteAllCookies();
        che.get("https://www.cleartrip.com/flights?utm_source=google&utm_medium=cpa&utm_campaign=BR_Cleartrip-Desktab&dxid=EAIaIQobChMInNvO8dTp-QIVtZVLBR3PmwA7EAAYASAAEgLzGvD_BwE&gclid=EAIaIQobChMInNvO8dTp-QIVtZVLBR3PmwA7EAAYASAAEgLzGvD_BwE");
        Thread.sleep(1000);
        //get collection of radio buttons
        List<WebElement>rad=che.findElements(By.xpath("//p[@class='fs-3 fw-600 c-neutral-900']"));
        Thread.sleep(5000);
        System.out.println(rad.size());
        for (WebElement vig : rad) {
			System.out.println(vig.getText());
        }
        che.close();
		}
	
	}


