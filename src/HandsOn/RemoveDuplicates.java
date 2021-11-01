package HandsOn;
import java.util.Arrays;
import java.util.*;

public class RemoveDuplicates {
	
	public static void main(String args[]) {
		 String[] strArr=new String[] {"Avni", "Sameer", "John","Avni","Sameer"};
		 
		 for (int i=0; i<strArr.length; i++) {
			 if(strArr[i]!=null) {
				 for(int j =i+1;j<strArr.length;j++) {
					 if(strArr[i].equals(strArr[j])) {
						 strArr[j]=null;
					 }
				 }
			 }
		 }
		 
		 for(int i=0; i<strArr.length;i++){
             if(strArr[i]==null)
                continue;
             System.out.println(strArr[i]);
         }
	}
	
}	
	
	

//	public static void main(String args[]){
//
//        String[] name = {"aim","rajesh","raju","aim"};
//
//        Set<String> myset  = new HashSet<String>();
//        Collections.addAll(myset,name);
//
//        System.out.println(myset);
//    }

