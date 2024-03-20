import java.util.*;
public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r= new Random();
		int total_score=0;
		int max_attempts=7;
		System.out.println("Welcome to The Number Guessing Game!!");
		System.out.println("You have "+ max_attempts+ " for each game");
		System.out.println("Lets Play !!");
		boolean playAgain=true;
		while(playAgain) {
			int targetNo = r.nextInt(100)+1;
			boolean guessedCorrectly = false;
			int attempt_left= max_attempts;
			System.out.println("\n New game started. Guess the number between 1-100");
			while(!guessedCorrectly && attempt_left>0) {
				System.out.println("Enter your Guess");
				int guess= sc.nextInt();
				if(guess==targetNo) {
					guessedCorrectly = true;
					System.out.println("Hurray !! You Guessed it correct :)");
					
				}
				else if( guess<targetNo) {
					
					if(guess==targetNo-1 ) {
						System.out.println(" Too close!! Try Again ");
					}
					else {
						System.out.println("OOPS!! Too low, Try Again :(");
					}
				}
				else {
					if(guess==targetNo+1) {
						System.out.println(" Too close!! Try Again ");
					}
					else {
					System.out.println("OOPS!! Too high, Try Again :(");
				}
				
			}
			
				attempt_left--;
			
			}
			if(!guessedCorrectly) {
				System.out.println("Sorry, The game is over . The Correct no. was: "+ targetNo);
				
			}
			total_score+= (attempt_left)*10;
			System.out.println("Your  current total score is "+ total_score);
			System.out.println("Do you want to Play Again? (YES/NO)");
			String playAgainInput = sc.next();
			playAgain =playAgainInput.equalsIgnoreCase("YES");
			
			}
		System.out.println(" Thank You for playing! Your total score is "+ total_score);
		

	}

}
