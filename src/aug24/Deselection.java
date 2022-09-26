package aug24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselection {

	public static void main(String[] args) {
		//write a script to select items ina multiple list box and deselct from selection
       WebDriver des=new ChromeDriver();
       des.manage().window().maximize();
       des.manage().deleteAllCookies();
       des.get("file:///C:/Users/INDIA/AppData/Local/Temp/Rar$EXa8456.35256/MultiListboxHtmlpage.html");
	   //store list box into select class
      
	}
	

}
