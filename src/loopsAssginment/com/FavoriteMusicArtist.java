package loopsAssginment.com;

import java.util.Scanner;

public class FavoriteMusicArtist {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String name = "";
	int count = 0;
	do {
		System.out.println("Enter your Favorite music artist...");
		name = sc.nextLine();
		if(!name.equals("exit")) {
			count++;
		}
		 	
		
	}while(!name.equals("exit")); 
	System.out.println(count);
}
}
