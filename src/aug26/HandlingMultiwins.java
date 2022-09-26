package aug26;

import java.util.Set;

import org.apache.xpath.operations.Equals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultiwins {

	public static void main(String[] args) throws Throwable {
		// write a script to handle multiple windows in gmail
        WebDriver mul=new ChromeDriver();
        mul.manage().window().maximize();
        mul.manage().deleteAllCookies();
        mul.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
        
        String parent=mul.getWindowHandle();
        System.out.println(parent);
        Thread.sleep(2000);
        mul.findElement(By.linkText("Help")).click();
        Thread.sleep(2000);
        mul.findElement(By.linkText("Privacy")).click();
        Thread.sleep(2000);
        mul.findElement(By.linkText("Terms")).click();
        Thread.sleep(2000);
        //get collection of all windows id's
        Set<String>allw=mul.getWindowHandles();
        System.out.println(allw);
        //parent window title
        String ptitle=mul.getTitle();
        System.out.println(ptitle);
        
        //iterate all windows
        for (String pos : allw) {
	    //if parent id not equals to child id
        if (!parent.equals(pos)) {
		//switch to all child windows and get title
        String title=mul.switchTo().window(pos).getTitle();
        System.out.println(title);
        mul.close();
        Thread.sleep(3000);
			}
		}
        mul.switchTo().window(parent);
        mul.findElement(By.id("identifierId")).sendKeys("ajaykumar1@gmail.com");
        Thread.sleep(3000);
        mul.quit();
	}

}
