/**
 * ---Rock-Paper-Scissor Game---
 * This is a game that you play versus your computer.
 * If you beat it you gain +1 more point and your computer loses -1 point.
 * If the PC beat you, it gains +1 more point and you lose -1 point as well.  
 * If you want to be the winner reach the 3 points!
 * Your PC is the winner when it reaches the -3.
 * 
 */

/**
 * @author ${Atalay Samet Ergen}
 *
 */
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;

public class rockPaperScissorsGame {
	static int counter = 0;
	static int rastgele;
	static int num;

	public static void main(String[] args) {
		process();
		System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");
		result();
		System.out.println("*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*");

	}

	public static void process() {
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("For SCISSOR:0\nFor ROCK:1\nFor PAPER:2\n\n");
			num = scan.nextInt();
			if (num > 2 || num < 0) {
				System.out.println("Invalid input! please choose valid input");

				continue;

			}

			startTheGame();

			if (counter == 3 || counter == -3) {
				break;
			}
		}
		scan.close();
	}

	public static void result() {
		if (counter == 3) {
			System.out.println("THE END! GAME OVER! Congratulations, You won the game!!!");
		} else if (counter == -3) {
			System.out.println("THE END! GAME OVER! OPS!!! You lost the game...");
		}

	}

	public static void startTheGame() {
		Scanner scan = new Scanner(System.in);

		Random rdn = new Random();
		rastgele = rdn.nextInt(3);
		diction();
		if (num == 0 && rastgele == 1) {
			counter -= 1;
			System.out.println("Rock beats the scissor, PC wins. -->Score : " + counter + "\n\n");

		} else if (num == 0 && rastgele == 2) {
			counter += 1;
			System.out.println("Scissor beats the papar, You win. -->Score : " + counter + "\n\n");
		} else if (num == 0 && rastgele == 0) {
			counter += 0;
			System.out.println("DRAW! You picked same things in this part. -->Score : " + counter + "\n\n");
		} else if (num == 1 && rastgele == 0) {
			counter += 1;
			System.out.println("Rock beats the scissor, You win -->Score : " + counter + "\n\n");
		} else if (num == 1 && rastgele == 1) {
			counter += 0;
			System.out.println("DRAW! You picked same things in this part. -->Score : " + counter + "\n\n");

		} else if (num == 1 && rastgele == 2) {
			counter -= 1;
			System.out.println("Paper beats the rock, PC wins. -->Score : " + counter + "\n\n");
		} else if (num == 2 && rastgele == 2) {
			counter += 0;
			System.out.println("DRAW! You picked same things in this part. -->Score : " + counter + "\n\n");
		} else if (num == 2 && rastgele == 1) {
			counter += 1;
			System.out.println("Paper beats the rock, You win. -->Score : " + counter + "\n\n");
		} else if (num == 2 && rastgele == 0) {
			counter -= 1;
			System.out.println("Scissor beats the paper, PC wins. -->Score : " + counter + "\n\n");
		}

	}

	public static void diction() {
		Dictionary<Integer, String> dict = new Hashtable<Integer, String>();
		dict.put(0, "SCISSOR");
		dict.put(1, "ROCK");
		dict.put(2, "PAPER");

		if (rastgele == 0) {
			System.out.println("PC : " + dict.get(0));

		} else if (rastgele == 1) {
			System.out.println("PC : " + dict.get(1));
		} else if (rastgele == 2) {
			System.out.println("PC : " + dict.get(2));
		}

	}

}
