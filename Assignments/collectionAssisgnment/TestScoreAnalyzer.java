package com.collectionAssisgnments;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

class ScoreAnalyzer{
	
	private LinkedList<Integer> runsData = new LinkedList<Integer>() ;

	public ScoreAnalyzer(LinkedList<Integer> runsData) {
		super();
		this.runsData = runsData;
	}

	public void addRunsToList() {
		
		System.out.println("Runs scored:  ");
		for(Integer i : runsData) {
			
			System.out.println(i +" ");
		}
		
	}
	
	public void calcRunRate() {
		System.out.println();
		double average;
		int highestRun=0;
		
		for (int i :runsData) {
			highestRun=highestRun+i;
		}
		average = 1.0f *highestRun/50;
		System.out.println("RunRate is " +average);
	}
	
	
	public void lowestRunsScored() 
	{
		System.out.println("Lowest Run scored " +Collections.min(runsData));
	}
	
	
	public void displayRuns() {
		
		System.out.println("Display the run "
		+ runsData);
		
	}
	
}


public class TestScoreAnalyzer {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of PLayers");
	
		int run = sc.nextInt();
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		for(int i=0;i<run;i++) {
			System.out.println("Enter player score" +(i+1));
			list.add(sc.nextInt());
		
			
		}
		
		ScoreAnalyzer scoreAna = new ScoreAnalyzer(list);
		
		System.out.println("Sample output");
		
		scoreAna.addRunsToList();
		scoreAna.calcRunRate();
		scoreAna.displayRuns();
		scoreAna.lowestRunsScored();
		
		
		
		
		
	}

}
