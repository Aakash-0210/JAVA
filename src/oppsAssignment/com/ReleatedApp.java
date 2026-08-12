package oppsAssignment.com;

class Customer {
	String name;
	String phone;
	String address;

	void createAccount(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		System.out.println("Account created for: " + name);
	}

	void updateProfile(String newAddress) {
		this.address = newAddress;
		System.out.println("Address updated to: " + address);
	}
}

class Restaurant {
	String restaurantName;
	String foodItem;
	double price;

	void addFoodItem(String foodItem, double price) {
		this.foodItem = foodItem;
		this.price = price;
		System.out.println(foodItem + " added at ₹" + price);
	}

	void deleteFoodItem() {
		System.out.println(foodItem + " deleted");
		foodItem = null;
		price = 0;
	}
}

class Order {
	String customerName;
	String foodItem;
	int quantity;
	double totalPrice;

	void createOrder(String customerName, String foodItem, int quantity, double price) {
		this.customerName = customerName;
		this.foodItem = foodItem;
		this.quantity = quantity;
		this.totalPrice = quantity * price;
		System.out.println("Order created");
		System.out.println("Customer: " + customerName);
		System.out.println("Food: " + foodItem);
		System.out.println("Quantity: " + quantity);
		System.out.println("Total: ₹" + totalPrice);
	}

	void cancelOrder() {
		System.out.println("Order cancelled for " + customerName);
	}

	void addComment() {
		System.out.println("Comment added");
	}

	void deleteComment() {
		System.out.println("Comment deleted");
	}
}

public class ReleatedApp {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.createAccount("Aakash", "9876543210", "Ahmedabad");
		customer.updateProfile("Surat");
		Restaurant restaurant = new Restaurant();
		restaurant.addFoodItem("Paneer Pizza", 299);
		Order order = new Order();
		order.createOrder("Aakash", "Paneer Pizza", 2, 299);
		order.cancelOrder();
	}
}
