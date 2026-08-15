package OppsAssginments2;
class Registration {
	
	
void registerUser(String email) {
	        System.out.println("User registered with email: " + email);
	    }

	     void registerUser(String email, String password) {
	        System.out.println("User registered with email: " + email);
	        System.out.println("Password: " + password);
	    }

	    
void registerUser(String email, String password, String phoneNumber) {
	        System.out.println("User registered with email: " + email);
	        System.out.println("Password: " + password);
	        System.out.println("Phone: " + phoneNumber);
	    }
}
class Playlist{
	String name;
	String description;
	
	Playlist(){
		this("bolly best playlist");
	
	}
Playlist(String name){
		this(name,"a stunning playlist");
	}
Playlist(String name, String description){
	this.name = name;
	this.description = description;
	
}
void display() {
    System.out.println("Name: " + name);
    System.out.println("Description: " + description);
}
}
class CartItem {
	private int productId;
	private int quantity;
	 CartItem(int productId){
		this.productId = productId;
		
	}
	 CartItem(int productId, int quantity){
		this.productId = productId;
		this.quantity = quantity;
		

	}
	 CartItem(CartItem other){
		this.productId = other.productId;
		this.quantity = other.quantity;
	
	}
	 void display() {
		 System.out.println("Product ID: " + productId);
	     System.out.println("Quantity: " + quantity);
	 }
	
}
class Movie{
	int rating = 0;
	String comment;
	void addReview(int rating){
System.out.println("rating.." + rating);
		
	}
void addReview(int rating, String comment){
	this.rating = rating;
	this.comment = comment;
	System.out.println("rating.." + rating);
	System.out.println("comment.." + this.comment);
	
	}

}
class Product {
	int price;
	String name;
	Product(){
		this.name = "earphone";
		this.price = 2344;
		System.out.println("Prodcut name.." + name);
		System.out.println("Prodcut price.." + price);
	}
Product(int price,String name ){
	this.name = name;
	this.price =price;
	System.out.println("Prodcut name.." + name);
	System.out.println("Prodcut price.." + price);
	
	
	}
Product(Product other){
	this.name = other.name;
	this.price =other.price;
	System.out.println("Prodcut name.." + this.name);
	System.out.println("Prodcut price.." + price);
}
}
public class Main {
 public static void main(String[] args) {
	 Product p1 = new Product();
	 Product p2 = new Product(2000,"headPhone");
	 Product p3 = new Product(p1);
	 
	 
	 Movie m1 = new Movie();
	 m1.addReview(4);
	 m1.addReview(3, "I will not give 5 rating");
	 
	 CartItem item1 = new CartItem(4); 
	 
	 CartItem item2 = new CartItem(5,3);
	 CartItem item3 = new CartItem(item2);
	 item1.display();
	 item2.display();
	 item3.display();

	 
	    Playlist pl1 = new Playlist();
      Playlist pl2 = new Playlist("Workout");
      Playlist pl3 = new Playlist("Workout", "Songs for gym");
      pl1.display();
      pl2.display();
      pl3.display();
	
;


Registration user = new Registration();

user.registerUser("aakash@gmail.com");

System.out.println();
user.registerUser("aakash@gmail.com", "abc123");

System.out.println();
user.registerUser("aakash@gmail.com", "abc123", "9876543210");

}
 
}
