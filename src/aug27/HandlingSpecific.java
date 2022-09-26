package aug27;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSpecific {

	public static void main(String[] args) throws Throwable {
		// Script to handle specific window when multi windows are open
        WebDriver spec=new ChromeDriver();
        spec.manage().window().maximize();
        spec.manage().deleteAllCookies();
        spec.get("https://www.irctc.co.in/nget/train-search");
        Thread.sleep(3000);
        spec.findElement(By.xpath("//button[normalize-space()='OK']")).click();
        Thread.sleep(5000);
        spec.findElement(By.xpath("//a[@aria-label='Flight opens a new window']//label[contains(text(),'FLIGHTS')]")).click();
        Thread.sleep(5000);
        spec.findElement(By.xpath("//a[@href='https://hotel.irctctourism.com/hotels']//label[contains(text(),'HOTELS')]")).click();
        Thread.sleep(5000);
        spec.findElement(By.xpath("//label[normalize-space()='RAIL DRISHTI']")).click();
        Thread.sleep(5000);
        spec.findElement(By.xpath("//label[normalize-space()='HOLIDAY PACKAGES']")).click();
        Thread.sleep(5000);
        spec.findElement(By.xpath("//label[normalize-space()='TOURIST TRAIN']")).click();
        Thread.sleep(5000);
//i wanna switch specific windows, for this first we have to store all windows in arraylist
        ArrayList<String>brw=new ArrayList<String>(spec.getWindowHandles());
        System.out.println(brw.size());
        for (String tit : brw) {
        	Thread.sleep(200);
			System.out.println(tit);		
		}
        
     spec.switchTo().window(brw.get(0));
     String title= spec.getTitle();
     System.out.println(title);
     Thread.sleep(5000);
     
        //comparision        
        spec.switchTo().window(brw.get(1));
        String Expected="pora";
        String actual=spec.getTitle();
        if (Expected.equalsIgnoreCase(actual)) {
			System.out.println("Matching::"+Expected+"  "+actual);
		}else
		{
			System.out.println("Not Matching::"+Expected+"  "+actual);
		}
        spec.switchTo().window(brw.get(0));
        Thread.sleep(5000);
        spec.switchTo().window(brw.get(1));
        Thread.sleep(5000);
        spec.switchTo().window(brw.get(2));
        Thread.sleep(5000);
        spec.switchTo().window(brw.get(3));
        Thread.sleep(5000);
        spec.switchTo().window(brw.get(4));
        Thread.sleep(5000);
        spec.switchTo().window(brw.get(5));
        Thread.sleep(5000);
	}
	}
