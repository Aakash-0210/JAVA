package arrayAssginment.com;

public class IPLMatchScores {
public static void main(String[] args) {
	 int[][] matchScores = {
	            {180, 195, 172}, // Team 1
	            {165, 210, 189}, // Team 2
	            {200, 175, 182}, // Team 3
	            {155, 168, 190}, // Team 4
	            {220, 205, 198}  // Team 5
	        };
	 
	 for(int team = 0; team < matchScores.length;team++ ) {
		 System.out.println("team" + (team + 1));
		 for(int score = 0; score < matchScores[team].length;score++ ) {
			 System.out.println("Score of last 3 match..." + matchScores[team][score]);
		 }
	 }
}
}
