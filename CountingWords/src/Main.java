import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		File fileName = new File("C:\\Users\\jorda\\eclipse-workspace\\CountingWords\\src\\usertextfile");
		BufferedReader fileText = new BufferedReader(new FileReader(fileName));
		String text;
		while ((text = fileText.readLine()) != null) {
			String[] listOfWords = text.split(" ");
			int amountofWords = listOfWords.length;
			System.out.println("Word count = " + amountofWords);
			

		}
		fileText.close();
	}
}
