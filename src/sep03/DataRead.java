package sep03;
import java.io.*;
public class DataRead {

	public static void main(String[] args) throws Throwable {
		// write a script to read data from notepad
     FileReader fr=new FileReader("E:/ajay22.txt");
     BufferedReader br=new BufferedReader(fr);
     String str=" ";
     while ((str=br.readLine())!=null) {
		System.out.println(str);
	}
  }

}
