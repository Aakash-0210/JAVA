package OppsAssginments2;
 abstract class UPITransaction {
	abstract void processTransaction(double amount); 
 } 
 class PaytmTransaction extends UPITransaction{

	@Override
	void processTransaction(double amount) {
		// TODO Auto-generated method stub
		System.out.println("payment done through paytem UPI");
	}
	 
 }
 class PhonePeTransaction extends UPITransaction{

	@Override
	void processTransaction(double amount) {
		// TODO Auto-generated method stub
		System.out.println("payment done through PhonePe UPI");

	}
	 
 }
 class MovieLibrary  implements searchable{
	 String[] movies = {
		        "Avengers",
		        "Avengers Endgame",
		        "Spider Man",
		        "Batman",
		        "Iron Man"
		    };
	 @Override
	 public void search(String keyword) {
		// TODO Auto-generated method stub
//		for(int i=0; i<movies.length;i++ ) {
//			if(movies[i].toLowerCase().contains(keyword.toLowerCase())) {
//				System.out.println(movies[i]);
//			}
//		}
		for (String movie : movies) {
		    if (movie.toLowerCase().contains(keyword.toLowerCase())) {
		        System.out.println(movie);
		    }
		}
		
	 }
	 
 }
class  ProductClass{
	private String productName;
	private double price;
	private double discount;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getFinalPrice() {
		return price - (price * discount)/100;
	}
}
class Playlist3 {
	private String name;
	private int totalSong;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setTotalSong(int totalSong) {
		this.totalSong = totalSong;
	}
	public int getTotalSong() {
		return this.totalSong;
	}
	
}
public class OppsAssginment_11 {
public static void main(String[] args) {
//	Playlist3 P1 = new Playlist3();
//	P1.setName("aaksh");
//	P1.setTotalSong(20);
//    System.out.println(P1.getName());
//    System.out.println(P1.getTotalSong());
//	
	ProductClass item1= new ProductClass();
	item1.setPrice(3002);
	item1.setDiscount(20);
	System.out.println("final Price..." + item1.getFinalPrice());
	
	/////
	PaytmTransaction paytm= new PaytmTransaction();
	paytm.processTransaction(200);
	PhonePeTransaction phone= new PhonePeTransaction();
	phone.processTransaction(200);
	MovieLibrary library = new MovieLibrary();
	library.search("Avengers");
}

}
