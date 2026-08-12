package oppsAssignment.com;
class InstaProfile {
	String username; 
	int followers;
	void increaseFollowers(int count) { 
		followers =+count; 
		System.out.println("Updated followers: " + followers);
		}
}
public class InstagramProfile {
public static void main(String[] args) {
	InstaProfile profile = new InstaProfile();
	profile.username = "Aakash"; 
	profile.followers = 100; 
	profile.increaseFollowers(500);
}
}
