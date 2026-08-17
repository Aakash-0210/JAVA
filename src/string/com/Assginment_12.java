package string.com;

import java.util.Scanner;


class InstaUsernameMasker {
	String userName;
	InstaUsernameMasker(String userName){
		this.userName = "****"+userName.substring(userName.length()-4);
		System.out.println(this.userName);
		
		
	}
}
public class Assginment_12 {
	public static String maskWalletID(String walletID) {
		StringBuffer sb = new StringBuffer();
		for(int i =0; i<walletID.length() -4; i++) {
			sb.append("*");
		}
		sb.append(walletID.substring(walletID.length() - 4));
	return	sb.toString();
		
	}
public static void main(String[] args) {
	InstaUsernameMasker user = new InstaUsernameMasker("insta_rockstar123");
	
    String walletID = "WAL123A4567A8";

    System.out.println(maskWalletID(walletID));
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter your first song:..");
//	String song1 = sc.nextLine();
//	System.out.println("enter your second song:..");
//	String song2 = sc.nextLine();
//	if(song1.equals(song2)) {
//        System.out.println("Both song titles are exactly the same.");
//
//	}else {
//        System.out.println("Both song titles are not the same.");
//
//	}
//	int result = song1.compareTo(song2);
//	 if (result == 0) {
//         System.out.println("Both songs are equal in lexicographical order.");
//     } else if (result < 0) {
//         System.out.println("\"" + song1 + "\" comes before \"" + song2 + "\".");
//     } else {
//         System.out.println("\"" + song1 + "\" comes after \"" + song2 + "\".");
//     }
//
//     sc.close();
     
     StringBuilder ID = new StringBuilder("ORD");
     ID.append("234234");
     System.out.println(ID);
     
     
    
     String message = "Given a long WhatsApp message string, use substring() and length() to extract and print only the first 30 characters, followed by '...' if the message is longer than 30 characters.<br><br><em><strong>Hint:</strong> Use message.length() to check the length before using substring()";
        int count = 0;
        String result = "";
     for(int i = 0; i <message.length(); i++) {
    	char ch = message.charAt(i);
    	if(ch != ' ') {
    		count++;
    	}
    	result = result + ch;
    	if(count == 30) {
    		break;
    	}
    }
     System.out.println(result + "...");
//     if(message.length() > 30) {
//       System.out.println( message.replace(" ", "").substring(0, 31)); 
//
//     }
     
     
	}
}
