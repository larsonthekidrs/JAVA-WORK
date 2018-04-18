import java.util.Scanner;
import java.util.Random;
public class program {
	public static void main(String[] args) {
		//	Initial Question, Displays Problem Choices
		System.out.println("How Many Questions Would You Like?");
		Scanner sc = new Scanner(System.in);
		Double num;
		num = sc.nextDouble();
		//	Sets Up How Many Times The Program Needs To Run To Repeat For How Many Questions.
		Double questions = 0.0;
		//	Start To Count How Many Problems That The User Got Right.
		Double right = 0.0;
		while (questions < num) {
			//	Ask User What Type Of Problem
			System.out.println("What Kind Of Problem Would You Like?");
			System.out.println("1 for \"+\", 2 for \"-\", 3 for \"*\", 4 for \"/\"");
			//	Takes Input Values For Problem Type
			Scanner sd = new Scanner(System.in);
			Double input;
			input = sc.nextDouble();
			//	Register What Problem They Would Like
			if (input == 1) {
				add(right, questions);
			} else if (input == 2) {
				subtract(right, questions);
			} else if (input == 3) {
				multiply(right, questions);
			} else if (input == 4) {
				divide(right, questions);
			} else if (questions == 1) {
				percentage(right, questions, num);
			} else {
				System.out.println("Not A Valid Problem.");
			}
			questions = questions + 1;
		}
		if (questions > 1) {
			percentage(right, questions, num);
		}
		//	Lets User Know That The Program Is Done Running!
		System.out.println("Program Done Running!");
	}
	public static void percentage(Double right, Double questions, Double num) {
			//	Lets user Know Percentage They Got Correct.
			Double percentage = (right / num);
			if (questions == 1.0) {
				System.out.println("You Got %" + percentage + " Right");
			} else if (questions > 1.0) {
				System.out.println("You Got %" + percentage + " Right");
			}
	}
	public static Double add(Double right, Double questions) {
		//	ADDS VALUE TO QUESTIONS
		questions = questions + 1;
		System.out.println("OK, Let's Add!");
		//	THIS IS THE RANDOM NUMBER GENERATOR
		Random rand = new Random(); //	This Declares The Random Number
		Double  rnumber = rand.nextInt((int) 100.0) + 0.0; //	100 Is The Max, 0 Is The Min.
		//	THIS IS THE RANDOM NUMBER GENERATOR 2
		Random rand2 = new Random(); //	This Declares The Random Number
		Double  rnumber2 = rand2.nextInt((int) 100.0) + 0.0; //	100 Is The Max, 0 Is The Min.
		//	This Will Ask The Question!
		System.out.println("What Is, " + rnumber + " + " + rnumber2 + "?"); //	This Will Ask Question.
		//	Takes Input Values For What User Thinks Answer Is.
		Scanner sc = new Scanner(System.in);	
		Double add; //	This Is The User Answer
		add = sc.nextDouble(); //	This Sets Current Scanner To The User Answer
		//	Tell User If It Is Right Or Wrong!
		int answer = (int) (rnumber + rnumber2); //	Creates INT To Determine The Right Answer
		if (add == answer) {	//	Compares User Answer To The Correct Computer Answer	
			System.out.println("Correct!"); //	Prints Out Correct
			right = right + 1.0;
		} else {
			System.out.println("No, the correct answer is " + answer);	// Prints The Correct Answer.	
		}
		return questions;
	}
	public static Double subtract(Double right, Double questions) {
		//	ADDS VALUE TO QUESTIONS
		questions = questions + 1;
		System.out.println("OK, Let's Subtract!");
		//	THIS IS THE RANDOM NUMBER GENERATOR
		Random rand = new Random(); //	This Declares The Random Number
		Double  rnumber = (double) (rand.nextInt(100) + 0); //	100 Is The Max, 0 Is The Min.
		//	THIS IS THE RANDOM NUMBER GENERATOR 2
		Random rand2 = new Random(); //	This Declares The Random Number
		Double  rnumber2 = (double) (rand2.nextInt(100) + 0); //	100 Is The Max, 0 Is The Min.
		//	This Will Ask The Question!
		System.out.println("What Is, " + rnumber + " - " + rnumber2 + "?"); //	This Will Ask Question.
		//	Takes Input Values For What User Thinks Answer Is.
		Scanner sc = new Scanner(System.in);	
		Double sub; //	This Is The User Answer
		sub = sc.nextDouble(); //	This Sets Current Scanner To The User Answer
		//	Tell User If It Is Right Or Wrong!
		int answer = (int) (rnumber - rnumber2); //	Creates INT To Determine The Right Answer
		if (sub == answer) {	//	Compares User Answer To The Correct Computer Answer
			System.out.println("Correct!"); //	Prints Out Correct
			right = right + 1;
		} else {
			System.out.println("No, the correct answer is " + answer);	// Prints The Correct Answer.
		}
		return questions;
	}
	public static Double multiply(Double right, Double questions) {
		//	ADDS VALUE TO QUESTIONS
		questions = questions + 1;
		System.out.println("OK, Let's Multiply!");
		//	THIS IS THE RANDOM NUMBER GENERATOR
		Random rand = new Random(); //	This Declares The Random Number
		Double  rnumber = (double) (rand.nextInt(100) + 0); //	100 Is The Max, 0 Is The Min.
		//	THIS IS THE RANDOM NUMBER GENERATOR 2
		Random rand2 = new Random(); //	This Declares The Random Number
		Double  rnumber2 = (double) (rand2.nextInt(100) + 0); //	100 Is The Max, 0 Is The Min.
		//	This Will Ask The Question!
		System.out.println("What Is, " + rnumber + " * " + rnumber2 + "?"); //	This Will Ask Question.
		//	Takes Input Values For What User Thinks Answer Is.
		Scanner sc = new Scanner(System.in);	
		Double mul; //	This Is The User Answer
		mul = sc.nextDouble(); //	This Sets Current Scanner To The User Answer
		//	Tell User If It Is Right Or Wrong!
		int answer = (int) (rnumber * rnumber2); //	Creates INT To Determine The Right Answer
		if (mul == answer) {	//	Compares User Answer To The Correct Computer Answer
			System.out.println("Correct!"); //	Prints Out Correct
			right = right + 1;
		} else {
			System.out.println("No, the correct answer is " + answer);	// Prints The Correct Answer.
		}
		return questions;
	}
	public static Double divide(Double right, Double questions) {
		//	ADDS VALUE TO QUESTIONS
		questions = questions + 1;
		System.out.println("OK, Let's Divide!");
		//	THIS IS THE RANDOM NUMBER GENERATOR
		Random rand = new Random(); //	This Declares The Random Number
		Double  rnumber = (double) (rand.nextInt(100) + 0); //	100 Is The Max, 0 Is The Min.
		//	THIS IS THE RANDOM NUMBER GENERATOR 2
		Random rand2 = new Random(); //	This Declares The Random Number
		Double  rnumber2 = (double) rand2.nextInt(100) + 0; //	100 Is The Max, 0 Is The Min.
		//	This Will Ask The Question!
		System.out.println("What Is, " + rnumber + " / " + rnumber2 + "?" + ", Round To The Nearest 100th Place."); //	This Will Ask Question.
		//	Takes Input Values For What User Thinks Answer Is.
		Scanner sc = new Scanner(System.in);	
		Double div; //	This Is The User Answer
		div = sc.nextDouble(); //	This Sets Current Scanner To The User Answer
		//	Tell User If It Is Right Or Wrong!
		int answer = (int) (rnumber / rnumber2); //	Creates Double To Determine The Right Answer
		double answerrounded = Math.round(answer * 100.0) / 100.0; // Creates Answer To The Nearest 100th
		if (div == answerrounded) {	//	Compares User Answer To The Correct Computer Answer
			System.out.println("Correct!"); //	Prints Out Correct
			right = right + 1;
		} else {
			System.out.println("No, the correct answer is " + answerrounded);	// Prints The Correct Answer.	
		}
		return questions;
	}
}
