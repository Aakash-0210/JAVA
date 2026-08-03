package conditionAssginment.com;

public class FilterByMinRating {
        //method
	public static void filterByMinRating(int[] ratings, int miniRating) {
		
		for(int i = 0; i < ratings.length; i++) {
			if(ratings[i]>= miniRating) {
				System.out.println(ratings[i]);
			}
		}
	}

public static void main(String[] args) {
	int[] ratings = {2,3,4,5,6};
	filterByMinRating(ratings, 3);
}
}
