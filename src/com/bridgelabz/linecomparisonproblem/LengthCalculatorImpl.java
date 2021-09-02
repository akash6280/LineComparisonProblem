package com.bridgelabz.linecomparisonproblem;

public class LengthCalculatorImpl implements LengthCalculatorIF {
	
	public double lengthOfLine(Line line){
			
			return Double.valueOf(Math.sqrt((Math.pow(line.startPoint.getxCoordinate()-line.endPoint.getxCoordinate() , 2))+(Math.pow(line.startPoint.getyCoordinate() - line.endPoint.getyCoordinate(), 2))));
		}
	}