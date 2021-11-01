package HandsOn;
import java.util.Scanner;

public class NameOrder {

	public static void main(String[] args) {
		int n;
		String temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of names you want to enter : ");
		n = sc.nextInt();
		String names[] = new String[n];
		
		Scanner str = new Scanner(System.in);
		
		for(int i =0 ; i<n;i++) {
			names[i]= str.nextLine();
		}
		
		for(int i = 0;i<n;i++) {
			for(int j=i+1; j<n;j++) {
				if(names[i].compareTo(names[j])>0) {
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		System.out.println("The name in Alphabetical order are : ");
		for(int i = 0; i<n;i++) {
			System.out.print(names[i]+ " ");
		}
	}

}
