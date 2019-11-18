import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String reverse = "";
		String userWord;
		System.out.println("Please enter a word");

		if (!input.hasNext("^[A-Za-z]+$")) {
			System.out.println("Invalid word. Please ensure that there are no numbers");
			input.nextLine();
		}
		userWord = input.nextLine().toLowerCase();
		for (int i = userWord.length() - 1; i >= 0; i--) {
			reverse = reverse + userWord.charAt(i);
		}
		if (userWord.equals(reverse)) {
			System.out.print("This is a palindrome");
		} else {
			System.out.print("This is not a palindrome");
		}
		input.close();
	}
}

