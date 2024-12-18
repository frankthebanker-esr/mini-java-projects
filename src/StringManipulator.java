import java.util.Scanner;
public class StringManipulator {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String: ");
		String str = scanner.nextLine();

		System.out.println("Please choose what you would like to do (1-8): ");
		System.out.println("1. Count Vowels in String");
		System.out.println("2. Reverse String");
		System.out.println("3. Print String in Uppercase");
		System.out.println("4. Print String in Lowercase");
		System.out.println("5. Print String Acronym");
		System.out.println("6. Count Words in String");
		System.out.println("7. Count Characters in String");
		System.out.println("8. Count Digits in String");
		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			System.out.println("There are " + countVowels(str) + " Vowel(s) in the String");
			break;
		case 2:
			System.out.println("The String Reversed: " + getReverse(str));
			break;
		case 3:
			System.out.println("The String in Uppercase: " + str.toUpperCase());
			break;
		case 4:
			System.out.println("The String in Lowercase: " + str.toLowerCase());
			break;
		case 5:
			System.out.println("The Acronym: " + getAcronym(str));
			break;
		case 6:
			System.out.println("There are " + countWords(str) + " Word(s) in the String");
			break;
		case 7:
			System.out.println("There are " + str.length() + " Character(s) in the String");
			break;
		case 8:
			System.out.println("There are " + countDigits(str) + " Digit(s) in the String");
			break;
			
		}

		scanner.close();

	}
	public static int countVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			switch(str.charAt(i)) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				count++;
				break;
			}
		}
		return count;
	}
	public static String getReverse(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >- 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

	public static String getAcronym(String str) {
		String acronym = "";
		acronym += str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (Character.isWhitespace(str.charAt(i))) {
				acronym += str.charAt(i + 1);
			}
		}
		return acronym;
	}

	public static int countWords(String str) {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isWhitespace(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	public static int countDigits(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		return count;
	}
}
