package scoreAnalyzer;

import java.util.ArrayList;
import java.util.Iterator;

public class ScoreUtil {
	
	double getAverageScore(int[] scores) {
		double sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		
		double average = sum / scores.length;
		return average;
	}
	
	int getHighestScore(int[] scores) {
		
		int highestScore = scores[0];
		
		for (int i = 1; i < scores.length; i++) {
	
			if (scores[i] > highestScore) {	
				highestScore = scores[i];	
			} 
		}
		
		return highestScore;
		 
	}
	
	int getLowestScore(int[] scores) {
		
		int lowestScore = scores[0];
		
		for (int i = 1; i < scores.length; i++) {
			 
			if (scores[i] < lowestScore) {	
				lowestScore = scores[i];	
			} 
		}
		
		return lowestScore;
		 
	}
	
	void printPassingScores(int[] scores, int passingMark) {
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= passingMark) {
				System.out.print(scores[i] + " ");
			}
		}
	}
		
	int[] getFailingScores(int[] scores, int passingMark) {
	    int size = 0;
	    
	    //count failed scores
	    for (int score : scores) {
	        if (score < passingMark) {
	            size++;
	        }
	    }

	    int[] failingScores = new int[size];
	    int currentIndex = 0; 

	    for (int i = 0; i < scores.length; i++) {
	        if (scores[i] < passingMark) {
	            failingScores[currentIndex] = scores[i];
	            currentIndex++; 
	        }
	    }
	    
	    return failingScores;
	}
	
	int getSecondHighest(int[] scores) {
	  
	    int highest;
	    int secondHighest;

	    if (scores[0] > scores[1]) {
	        highest = scores[0];
	        secondHighest = scores[1];
	    } else {
	        highest = scores[1];
	        secondHighest = scores[0];
	    }

	    for (int i = 2; i < scores.length; i++) {
	        if (scores[i] > highest) {
	            secondHighest = highest;
	            highest = scores[i];
	        } else if (scores[i] > secondHighest && scores[i] != highest) {
	            secondHighest = scores[i];
	        }
	    }

	    return secondHighest;
	}
}


























