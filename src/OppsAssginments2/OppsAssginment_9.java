package OppsAssginments2;
class Song {
		String title;
		String artist;
}
class PremiumSong extends Song {
	boolean lyricsAccess = true;
}
class FoodOrder {
	int amount;
	int calculateTotal(int amount){
		return this.amount = amount;
	}
}
class ZomatoGoldOrder  extends FoodOrder{
	int discountedPrice;
	@Override
	int calculateTotal(int discount) {
		super.calculateTotal(amount);
	discountedPrice = (super.amount * discount)/100;
	return super.amount - discountedPrice;
	}
}
class UserProfile {
	
	String name;
	 UserProfile() {
		this.name = "ketan";
		
	}
	  void displayProfile() {
	        System.out.println("Name: " + name);
	    }
}
class InfluencerProfile extends UserProfile{
	int followers;
	InfluencerProfile(int followers, String name){
		super();
		this.followers = followers;
	}
	void displayInfluencerProfile() {
		displayProfile();
		  System.out.println("follower: " + followers);
	}
	
}
class  BrandProfile extends UserProfile{
	String brandName;
	BrandProfile(String name, String brandName){
		super();
		this.brandName = brandName;
	}
}
class  ProductOfFlipkart {
	String name;
	ProductOfFlipkart(String name) {
		this.name = name; 
		System.out.println(this.name);
		}
	}

public class OppsAssginment_9 {
public static void main(String[] args) {
	

//	ZomatoGoldOrder user1 = new ZomatoGoldOrder();
//	user1.amount = 233;
//	System.out.println(user1.calculateTotal(30));
	
//	InfluencerProfile user1= new InfluencerProfile(2000,"aakash");
//	user1.displayInfluencerProfile();
	AppUser user1 =new  AppUser("aakash");
	VerifiedUse user2 = new VerifiedUse("Bhavesh");
	CelebrityUser user3 = new CelebrityUser("Ketan");
	ProductOfFlipkart p1 = new ProductOfFlipkart("bat");
}
}
class AppUser {
	String name;
	AppUser(String name){
		this.name = name;
		System.out.println("user name is..." + name);
	}

}
class  VerifiedUse extends AppUser{
	VerifiedUse(String name){
		super(name);
	}
}
class CelebrityUser extends VerifiedUse{
	CelebrityUser(String name){
		super(name);
	}
}