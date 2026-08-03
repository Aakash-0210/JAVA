package loopsAssginment.com;

public class CricketScores {

//	
//	Store cricket scores in an array.
//	Iterate through the array.
//	If a score is below 50, use continue to skip it.
//	If a score is 200, use break to stop processing immediately.
//	Otherwise, print or process the score.
	
	public static void main(String[] args) {
		int[] score = {2,200,345,52,234,23,65,33,76};
		for(int i = 0; i < score.length; i++) {
			if(score[i] < 50) {
			       System.out.println(score[i]);
				continue;
				
			}
			if(score[i] ==200) {
				break;
			}
		}
	}
}
