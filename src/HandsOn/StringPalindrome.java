package HandsOn;
import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String a = sc.nextLine();
		int n = a.length();
		String b = "";
		for(int i = n -1;i>=0;i--) {
			b = b + a.charAt(i);
		}
		
		if(a.equalsIgnoreCase(b)) {
			System.out.println("The String is Palindrome");
		}else {
			System.out.println("The String is not Palindrome");
		}

	}

}
