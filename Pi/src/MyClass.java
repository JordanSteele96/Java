import java.util.Scanner;
public class MyClass {

	public static void main(String[] args) {
		Scanner findingNthNumber = new Scanner(System.in);
		System.out.print("How many digits of pi do you want?");
		int nthValue = findingNthNumber.nextInt();
		
		findingNthNumber.close();
		double num = 3.14159265359;
		String numberString = Double.toString(num);

		for (int i = 0; i < Math.min(numberString.length(), nthValue); i++){
		    char c = numberString.charAt(i);        
		    System.out.print(c);
		}
	}
}