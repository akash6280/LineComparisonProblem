package com.bridgelabz.linecomparisonproblem;

public class LengthComparatorImpl implements LengthComparatorIF{
	
	LengthCalculatorIF lengthCalculator =  new LengthCalculatorImpl(); 
	
	public void equals(Line line1, Line line2) {
		
		Double lengthOfLine1= lengthCalculator.lengthOfLine(line1);
		Double lengthOfLine2= lengthCalculator.lengthOfLine(line2);
		
		if(lengthOfLine1.equals(lengthOfLine2)) 
			System.out.println("Lines Are equal");
		else
			System.out.println("Lines Are unequal");
		
	}

	public void compareTo(Line line1, Line line2) {
		
		Double lengthOfLine1= lengthCalculator.lengthOfLine(line1);
		Double lengthOfLine2= lengthCalculator.lengthOfLine(line2);

		if(lengthOfLine1.compareTo(lengthOfLine2) >0) 
			System.out.println("Line 1 is large");
	
		else if(lengthOfLine1.compareTo(lengthOfLine2) <0) 
			System.out.println("Line 2 is large");
		
		else
			System.out.println("Both lines are equal");
			

	}
}
