package com.bridgelabz.linecomparisonproblem;

import java.util.Scanner;
public class LineCompariosnMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter coordinates of line");
		double xStartCoordinate=scanner.nextDouble();
		double yStartCoordinate=scanner.nextDouble();
		double xEndCoordinate=scanner.nextDouble();
		double yEndCoordinate=scanner.nextDouble();
		
		double lengthOfLine=Math.sqrt((xStartCoordinate-xEndCoordinate)*(xStartCoordinate-xEndCoordinate)+(yStartCoordinate-yEndCoordinate)*(yStartCoordinate-yEndCoordinate));
		
		System.out.printf("Length of line is %.2f",lengthOfLine);
		
		scanner.close();
		
	}
}
