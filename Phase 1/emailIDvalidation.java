package demo;
import java.util.*;

public class emailIDvalidation {
	public static void main(String args[]) {
 	   Scanner sc=new Scanner(System.in);   

 	   String[] emailId=new String[5];

 	   for(int i=0;i<emailId.length;i++) {
 		   System.out.println("Enter a EMail Id: ");
 		   emailId[i]=sc.next();
 	   }
 	   
 	   for(String id: emailId) {
 		   System.out.println("Array of EMail Id's: "+id);
 	   }

 	   System.out.println("Enter the EMail Id that you want to search:");
 	   String searchId=sc.next();
 	   
 	   for(int i=0;i<emailId.length;i++) {
 		    if(searchId.equals(emailId[i])) {
 		    	System.out.println("The EMail id is found at index: "+i);
 		    }
 	   }   
   }

}
