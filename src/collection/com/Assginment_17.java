package collection.com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
class ProductF { 
	String name; 
	int price; 
	ProductF(String name, int price) { 
		this.name = name; 
		this.price = price;
		}
	}
public class Assginment_17 {
public static void main(String[] args) {

	HashMap<String, Double> orders = new HashMap<>();
	HashMap<Integer, ProductF> products = new HashMap<>();
    orders.put("ORD101", 250.50);
    orders.put("ORD102", 450.00);
    orders.put("ORD103", 175.75);
    orders.put("ORD104", 620.25);
    orders.put("ORD105", 320.00);
  Set set = orders.entrySet() ; 
  Iterator it= set.iterator();
    while(it.hasNext()) {
    	Map.Entry me = (Map.Entry) it.next();
    	System.out.println("key is ..." + me.getKey());
    	System.out.println("value is ..." + me.getValue());

        System.out.println();

    }
   
    products.put(101, new ProductF("iPhone 15", 70000));
    products.put(102, new ProductF("Samsung Galaxy", 45000));
    products.put(103, new ProductF("Bluetooth Speaker", 1500));
    products.put(104, new ProductF("USB Cable", 500));
    
    Iterator<Entry<Integer, ProductF>> i1 = products.entrySet().iterator();
    while(i1.hasNext()) {
    	Map.Entry entry = (Entry) i1.next();
    	ProductF p = (ProductF) entry.getValue();    	
    	if(p.price >1000) {
    		System.out.println( entry.getKey() + " : " + p.name + " : ₹" + p.price );
    	}
    }
	
}
}
