package HandsOn;
import java.util.Scanner;  
public class VowelAlphabets {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner sc= new Scanner(System.in); 
		String mystr = sc.nextLine();
		int vowel=0;
		int notVowel;
		
			
		for(int i =0;i< mystr.length();i++) {
			char ch = mystr.charAt(i);
			if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch=='u') {
				vowel++;
			}
		}
		notVowel = mystr.length()-vowel;
		
		System.out.println("The Total Number of Vowels are : "+vowel);
		System.out.println("The Total Number of Non-Vowels are : "+notVowel);
	}

}
 







