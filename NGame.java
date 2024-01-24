import java.util.Scanner;

public class NGame {

	public static void guessingNumberGame()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("Guess a number between 1 to 100");
		int number = 1 + (int)(100* Math.random());
		int N = 7;
		int i, guess;
		System.out.println("Guess the number"+ " within 7 trials.");
		for (i = 0; i < N; i++) {
            System.out.println("\nGuess the number:");
            guess = sc.nextInt();
			if (number == guess) {
				System.out.println("**********Congratulations!***********"+" You guessed the number.");
				break;
			}
			else if (number > guess	&& i != N - 1) {
				System.out.println("The number is "+ " too low " + guess);
			}
			else if (number < guess && i != N - 1) {
				System.out.println("The number is"+ " too high " + guess);
			}
		}

		if (i == N) {
			System.out.println("You have exhausted"+ " N trials.");
            System.out.println("The number was " + number);
		}
	}
    public static void main(String arg[])
	{
		guessingNumberGame();
	}
}
