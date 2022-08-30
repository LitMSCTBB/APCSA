package practice;

import java.util.List;
import java.util.ArrayList;

//create the MultPractice class

public class MultPractice implements StudyPractice {
	private int first, second;
	public MultPractice(int f, int s) {
		first = f; second = s;
	}
	
	public String getProblem() {
		return ""+first+" TIMES "+second;
	}
	
	public void nextProblem() {
		second++;
	}
}