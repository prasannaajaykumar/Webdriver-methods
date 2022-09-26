package sep03;
import java.io.*;
public class Filehandling {

	public static void main(String[] args) throws Throwable {
		// Script to create new file and write some text
        //create new file
		File f=new File("E:/filehand.txt");
		FileWriter fr=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fr);
		bw.write("Hi iam Ajay");
		bw.newLine();
		bw.write("Iam going to nellore");
		bw.flush();
		bw.close();
	}

}
