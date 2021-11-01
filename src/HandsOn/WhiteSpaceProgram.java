package HandsOn;
import java.util.Scanner;

public class WhiteSpaceProgram {

	public static void main(String[] args) {
		
		System.out.println("Enter any string:");
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        
        for(int i=0; i<=str.length()-1; i++){
        	char ch=str.charAt(i);
        	 if(ch==' '){
        	        System.out.println("White pace character is present in the string");
        	        break;
        	    }
        	
        	 
        	}
	}

}
