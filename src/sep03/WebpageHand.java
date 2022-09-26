package sep03;
import java.io.*;
import java.nio.Buffer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebpageHand {

	public static void main(String[] args) throws Throwable {
		// script to capture text from webpage and write it on notepad
		  //create new file
	       File f=new File("E:/ajay22.txt");
	       FileWriter fr=new FileWriter(f);
	       BufferedWriter br=new BufferedWriter(fr);
       WebDriver driver= new ChromeDriver();
       driver.navigate().to("http://primusbank.qedgetech.com/");
       String para1=driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getText();
       String para2=driver.findElement(By.xpath(" //p[contains(text(),'In 1975, the Malta Government purchased 25% of')]")).getText();
       br.write(para1);
       br.newLine();
       br.write(para1.length());
       br.newLine();
       br.write(para2);
       br.newLine();
       br.write(para2.length());
       br.flush();
       br.close();
       driver.close();
	}

}
