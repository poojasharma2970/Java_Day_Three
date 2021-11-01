package HandsOn;

public class StringEigthQues {

	public static void main(String[] args) {
		String str = "Try to learn something about everything and everything about something";
		String newStr = "otherwise fix it";
		
		char c = str.charAt(10);
		
		System.out.println("The 10th character in the string is : "+c);
		
		str.contains("is");
	    System.out.println("The String contains the word 'is' is " +str.contains("is"));
	
	    String conStr=str.concat(newStr);  
	    System.out.println(conStr);
	    
	    str.endsWith("how");
	    System.out.println("The String contains the word 'how' is " +str.endsWith("how"));
	    
	    String str1 = "Try to learn Some-thing about Everything and Everything about Something.";
	    str.equals(str1);
	    
	    System.out.println("The strings are equal : " + str.equals(str1));
	    
	    String str2 ="TRY TO LEARN SOMETHING ABOUT EVERYTHING AND EVERYTHING AND EVERYTHING ABOUT SOMETHING";
	    str.equals(str2);
	    System.out.println("The stings are equal is " + str.equals(str2));
	    
	    int index1=str.indexOf("a");  
	    System.out.println("index position of character 'a' is " +str.indexOf("a"));
	    
	    int index2=str.lastIndexOf("e");
	    System.out.println("index position of character 'e' is " +str.lastIndexOf("e"));
	    
	    int length = str.length();
	    System.out.println("length of string is " +str.length());
	    String str6 = "Try to learn something about everything and everything about something.";
	    System.out.println("String matches "+str.matches(str6));
	    
	    str.replace("something","nothing");
	    System.out.println("Replaced string = "+str.replace("something","nothing"));
	    
	    String[] arr1 = str.split("everything",2);
	    System.out.println("Splited String = "+arr1);
	    for (String a : arr1)
	        System.out.println(a);
	    
	    for (String word : str.split(" "))
	        if (word.length() % 2 == 0)
	            System.out.println(word);
	    
	    str.toLowerCase();
	    System.out.println("The String in lower case is : "+str.toLowerCase());
	    
	    str.toUpperCase();
	    System.out.println("The String in Upper case is : "+str.toUpperCase());
	    
	}

}



	    
	    

	    