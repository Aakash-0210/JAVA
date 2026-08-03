package loopsAssginment.com;

public class ZomatoOrderSummary {
public static void main(String[] args) {
	int[] arr = new int[]{234, 4522, 5435,3334, 345345,};
	int total = 0;	
	int j = 0;
	while(j<arr.length ) {
		total+=arr[j];
		j++;
	}
	System.out.println(total);
}
}
