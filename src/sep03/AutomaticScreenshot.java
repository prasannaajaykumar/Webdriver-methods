package sep03;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class AutomaticScreenshot {

	public static void main(String[] args) throws Throwable {
		// Script to take a screenshot
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.navigate().to("https://www.facebook.com/");
       //take screenshot 
       File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       //copy screen into local system
      
       //java time stamp
       Date date =new Date();
       DateFormat df=new SimpleDateFormat("YYYY_MM_dd"+"  "+"hh_mm_ss");
       String datef=df.format(date);
       FileUtils.copyFile(screen, new File("E:/screenshot/"+datef +"hui.jpeg"));
       driver.close();
	}

}
