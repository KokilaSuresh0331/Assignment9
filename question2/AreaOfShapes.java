package com.assignment9.question2;

public  class AreaOfShapes  {
	public static void main(String[] args) {
       
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}