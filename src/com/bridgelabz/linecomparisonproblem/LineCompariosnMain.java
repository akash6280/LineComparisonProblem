package com.bridgelabz.linecomparisonproblem;

import java.util.Scanner;
public class LineCompariosnMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
		
		System.out.println("Enter coordinates of line 1 as (x1,y1) and (x2,y2)");
		Point startPointLine1 = new Point(scanner.nextDouble(),scanner.nextDouble());
		Point endPointLine1 = new Point(scanner.nextDouble(),scanner.nextDouble());	
		
		System.out.println("Enter coordinates of line 2 as x1,y1) and (x2,y2)");

		Point startPointLine2 = new Point(scanner.nextDouble(),scanner.nextDouble());
		Point endPointLine2 = new Point(scanner.nextDouble(),scanner.nextDouble());
		
	    LengthComparatorIF lengthCalculator =  new LengthComparatorImpl();
		
		Line line1=new Line(startPointLine1,endPointLine1);
		Line line2=new Line(startPointLine2,endPointLine2);
		
		lengthCalculator.compareTo(line1,line2);
		lengthCalculator.equals(line1,line2);
		
		
		scanner.close();
		
	}
}
