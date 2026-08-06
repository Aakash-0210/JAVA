package arrayAssginment.com;

import java.util.Scanner;

public class RecentSearches {

public static void main(String[] args) {
		String[] recentSearches = new String[5]; 
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < recentSearches.length; i++) {
			System.out.println("enter your search list...");
			recentSearches[i] = sc.nextLine();
			
		}
		
		for(int i = 0; i < recentSearches.length; i++) {
			System.out.print(recentSearches[i] + ", ");		
			}
		  sc.close(); 
	}

}
