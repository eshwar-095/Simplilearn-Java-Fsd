package demo;
import java.util.*;
public class EmailPrblm {
	public static void main(String[]args) {
			   ArrayList<String> UserMail = new ArrayList<String>();
			   int ArrayCount;
			   System.out.println("Enter the count of the arraylist:");
			   Scanner a = new Scanner(System.in);
			   ArrayCount= a.nextInt();
			   for(int i=0; i<ArrayCount;i++) {
				   System.out.println("Enter the email:");
				   UserMail.add(a.next());
			   }
			   System.out.println(UserMail);
			   for(String b : UserMail) {
				   System.out.println("MailId's in the UserMail ArrayList:"+b);
			   }
			   System.out.println("Enter the EMail Id that you want to search:");
		 	   String searchId=a.next();
		 	   for(int j=0;j<ArrayCount;j++) {
		 		    if(searchId.equals(UserMail.get(j))) {
		 		    	System.out.println("The EMail id is found at index: "+j);
		 		    }
		 		    else {
		 		    	System.out.println("Invalid");
		 		    }
			   }
	}
}