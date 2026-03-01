package scoreAnalyzer;

import java.util.Arrays;
import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		ScoreUtil scoreUtil = new ScoreUtil();
		
		System.out.print("How many score do you want to input: ");
		int size = scan.nextInt();
		
		int[] scores = new int[size];	
		
		for (int i = 0; i < scores.length; i++) {
			System.out.print("Enter score " + (i+1) + ": ");
			scores[i] = scan.nextInt();
		}
		
	
		Arrays.sort(scores);
	
		double averageScore = scoreUtil.getAverageScore(scores);
		int highestScore = scoreUtil.getHighestScore(scores);
		int lowestScore = scoreUtil.getLowestScore(scores);
		int secondHighestScore = scoreUtil.getSecondHighest(scores);
		int[] failingGrades = scoreUtil.getFailingScores(scores, 75);
		
		
		System.out.println("\n----- Student Scores Analyzer ----");
		System.out.println("Scores: " + Arrays.toString(scores));
		System.out.println("\nAverage Score: " + averageScore);
		System.out.println("Highest Score: " + highestScore);
		System.out.println("Second Highest Score: " + secondHighestScore);
		System.out.println("Lowest Score: " + lowestScore);
		
		System.out.println("\nPassing Scores (>= 75): ");
		scoreUtil.printPassingScores(scores, 75);
		System.out.println("\n\nFailing Scores (< 75): " + "\n" + Arrays.toString(failingGrades));
		
	}

}
