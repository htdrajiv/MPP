package com.mum.labs.lab5.problem3;

import java.util.Arrays;
import java.util.List;

public class MainClass {
	public static void main(String[] args){
		 // making circle instances
		Shape circle1 = new Circle(5);
		Shape circle2 = new Circle(5);
		Shape circle3 = new Circle(5);
		
		// making triangle instances
		Shape triangle1 = new Triangle(5,6);
		Shape triangle2 = new Triangle(4,6);
		Shape triangle3 = new Triangle(7,9);
		
		// making rectangle instances
		Shape rectangle1 = new Rectangle(4,5);
		Shape rectangle2 = new Rectangle(4,5);
		Shape rectangle3 = new Rectangle(4,5);
		
		// adding all instances to a list
		List<Shape> shapes = Arrays.asList(circle1,circle2,circle3,triangle1,triangle2,triangle3,
				rectangle1,rectangle2,rectangle3);
		
		// calculating sum of areas
		double sumOfAreas = 0;
		for(Shape s : shapes){
			sumOfAreas += s.computeArea();
		}
		
		System.out.println("Sum of Areas = "+sumOfAreas);
	}
}
