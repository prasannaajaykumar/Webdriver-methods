package sep01;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Throwable {
		//write a script by using javascript
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        
        //launch uRL
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.location='https://www.flipkart.com/'");
       Thread.sleep(5000);
       
       //print title and length of the title
       String Title=js.executeScript("return document.title").toString();
       System.out.println(Title);
       System.out.println(Title.length());
       
       //print url and length of the url
       String url=js.executeScript("return document.URL").toString();
       System.out.println(url);
       System.out.println(url.length());
       
       //print domain name and length 
       String dom=js.executeScript("return document.domain").toString();
       System.out.println(dom);
       System.out.println(dom.length());
       
       driver.close();
	}
}
