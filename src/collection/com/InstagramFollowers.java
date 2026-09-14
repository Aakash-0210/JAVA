package collection.com;

import java.util.*;

public class InstagramFollowers {
	public static void printMostFollowerUser(HashMap<String, Integer> instagram){
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(instagram.entrySet());	
	
	 // Sort by follower count in descending order
    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

        @Override
        public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
            return b.getValue() - a.getValue();
        }
    });
    // Print top 3
    for (int i = 0; i < 3 && i < list.size(); i++) {
        Map.Entry<String, Integer> entry = list.get(i);

        System.out.println(
                entry.getKey() + " → " + entry.getValue()
        );
    }
	} 
public static void main(String[] args) {
	HashMap<String, Integer> Ig = new HashMap<>();
	Ig.put("virat", 270);
    Ig.put("ronaldo", 650);
    Ig.put("elon", 200);
    Ig.put("mrbeast", 300);
    Ig.put("alia", 80);

    printMostFollowerUser(Ig);
    
    ////////////Task-4
	/*    
	
	    A HashMap in Java is similar to a database table because both store data using a unique identifier to quickly find related information.
	    | Order ID | Order Details            |
| -------- | ------------------------ |
| 101      | Pizza, ₹250, Delivered   |
| 102      | Burger, ₹180, Delivered  |
| 103      | Biryani, ₹220, Cancelled |

	    */
}
}
