package collection.com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
class Product{
	String name;
	int price;
	Product(String name, int price){
		this.name = name;
		this.price = price;
	}
	
}
class Song {
    String title;
    String artist;
    double duration;

    Song(String title, String artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Duration: " + duration + " minutes");
        System.out.println();
    }
}
public class Assginment_16 {
public static void main(String[] args) {
	ArrayList<Song> songs = new ArrayList<>();
	Song s1 = new Song("Shape of You", "Ed Sheeran", 3.53);
	Song s2 = new Song("Blinding Lights", "The Weeknd", 3.20);
	Song s3 = new Song("Perfect", "Ed Sheeran", 4.23);
	Song s4 = new Song("Believer", "Imagine Dragons", 3.24);

	
	songs.add(s1);
	songs.add(s2);
	songs.add(s3);
	songs.add(s4);
	
	
	for(Song song: songs) {
	song.display();	
	}
	HashSet<String> usernames  = new HashSet<>();
	   usernames.add("Aakash");
       usernames.add("Rahul");
       usernames.add("Priya");
       usernames.add("Aman");
       usernames.add("Neha");
       usernames.add("Rahul");   
       usernames.add("Priya"); 
	
   	for(String username: usernames) {
   		System.out.println(username);
   		}
	
   	ArrayList<Product> products = new ArrayList<>();
   	Product p1 = new Product("Laptop", 234233);
   	Product p2 = new Product("ipad", 2342);
   	Product p3 = new Product("brush", 321);
   	Product p4 = new Product("Laptop", 234233);
   	products.add(p1);
   	products.add(p2);
   	products.add(p3);
   	products.add(p4);
   	
   	int totalPrice = 0;
   	for(Product product: products) {
		 totalPrice = totalPrice + product.price;
		 System.out.print(product.name + "," + product.price);
		 System.out.println();
   	}
   	System.out.println(totalPrice);
   	
   	
   	
    HashMap<String, Integer> followers = new HashMap<>();
    followers.put("virat.kohli", 270000000);
    followers.put("cristiano", 670000000);
    followers.put("selenagomez", 420000000);
    followers.put("therock", 395000000);
    followers.put("taylorswift", 285000000);


    // Find the highest follower count
    int maxFollowers = 0;

    for (Map.Entry<String, Integer> entry : followers.entrySet()) {

        if (entry.getValue() > maxFollowers) {
            maxFollowers = entry.getValue();
        }
    }
    // Display username(s) with highest followers
    System.out.println("Username(s) with highest followers:");


    for (Map.Entry<String, Integer> entry : followers.entrySet()) {

        if (entry.getValue() == maxFollowers) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

}
}
