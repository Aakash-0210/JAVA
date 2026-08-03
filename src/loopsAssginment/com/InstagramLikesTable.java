package loopsAssginment.com;

import java.util.Random;

public class InstagramLikesTable {
public static void main(String[] args) {
	int n = 4;
  Random random= new Random();
	for(int i = 1; i<= n; i++) {
		System.out.println("Week..." + i );
		for(int j= 1; j<= 7; j++) {
			
			int likes = random.nextInt(901) + 100;
			
			System.out.println("Day" + j + "|" + "Likes..." + likes + "|");
		}
	}
}
}
