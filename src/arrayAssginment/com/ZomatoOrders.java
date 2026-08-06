package arrayAssginment.com;

public class ZomatoOrders {
public static void main(String[] args) {
	// Array of 10 transaction amounts
    double[] transactions = {
        249.50, 399.00, 189.75, 520.00, 310.25,
        150.00, 670.80, 285.40, 450.60, 199.99
    };

    double total = 0;
    double min = transactions[0];
    double max = transactions[0];

    // Calculate total, minimum, and maximum
    for (int i = 0; i < transactions.length; i++) {
        total += transactions[i];

        if (transactions[i] < min) {
            min = transactions[i];
        }

        if (transactions[i] > max) {
            max = transactions[i];
        }
    }

    System.out.println("Recent Zomato Order Amounts:");
    for (int i = 0; i < transactions.length; i++) {
        System.out.println("Order " + (i + 1) + ": ₹" + transactions[i]);
    }

    
    System.out.println("\nTotal Spent: ₹" + total);
    System.out.println("Minimum Order Value: ₹" + min);
    System.out.println("Maximum Order Value: ₹" + max);
}
}
