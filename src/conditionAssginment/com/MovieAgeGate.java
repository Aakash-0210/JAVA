package conditionAssginment.com;

import java.util.Scanner;

public class MovieAgeGate {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter Your age for movie...");
	int age = sc.nextInt();
	if(age <= 13) {
		System.out.println("Kid Section");
		
	}else if(age > 13 && age <= 17) {
		System.out.println("Teen Section");
	}else {
		System.out.println("Adult Section");
	}
	}
}
