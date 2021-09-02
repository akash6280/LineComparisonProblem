package com.bridgelabz.linecomparisonproblem;

import java.util.Scanner;
public class LineCompariosnMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter coordinates of line 1 as (x1,y1) and (x2,y2)");
		double xStartCoordinate=scanner.nextDouble();
		double yStartCoordinate=scanner.nextDouble();
		double xEndCoordinate=scanner.nextDouble();
		double yEndCoordinate=scanner.nextDouble();
		
		Double lengthOfLine1=Math.sqrt((xStartCoordinate-xEndCoordinate)*(xStartCoordinate-xEndCoordinate)+(yStartCoordinate-yEndCoordinate)*(yStartCoordinate-yEndCoordinate));
		
		
		System.out.println("Enter coordinates of line 2 as x1,y1) and (x2,y2)");
		xStartCoordinate=scanner.nextDouble();
		yStartCoordinate=scanner.nextDouble();
		xEndCoordinate=scanner.nextDouble();
		yEndCoordinate=scanner.nextDouble();
		
		Double lengthOfLine2=Math.sqrt((xStartCoordinate-xEndCoordinate)*(xStartCoordinate-xEndCoordinate)+(yStartCoordinate-yEndCoordinate)*(yStartCoordinate-yEndCoordinate));
		
		if(lengthOfLine1.equals(lengthOfLine2))
			System.out.println("Lines are equal");
		else
			System.out.println("Lines are unequal");
		scanner.close();
		
	}
}
