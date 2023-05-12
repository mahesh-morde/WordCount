import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Word_Count {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please Enter the path of file");
		String filepath = br.readLine();
		
		File FileToBeRead = new File(filepath);
		FileInputStream filestream= null;
		FileWriter wordcountstream = null;
		
		if(FileToBeRead.exists()) {
			filestream = new FileInputStream(FileToBeRead);
			wordcountstream = new FileWriter("/Users/maheshmorde/Applications/WordCount/src/Write.txt");
			}
		else {System.out.println("File not exist at given path");
			}
		
		byte[] byteArray = new byte[(byte) FileToBeRead.length()];
		filestream.read(byteArray);
		String s = new String(byteArray);
		
		String[] data = s.split(" ");
		
		System.out.println("Number of words in the file are : "+ data.length);
		wordcountstream.write("Number of words in the file are : "+ data.length);
	
		br.close();
		filestream.close();
		wordcountstream.close();
	}

}
