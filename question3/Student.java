package com.assignment9.question3;

public class Student extends Parent {
	String studentName;
	Student(String name) {
		 super("Default Parent"); 
	        this.studentName = name;
	        System.out.println("Student constructor:"+name);
	}
	Student(String studentName, String parentName) {
        super(parentName); 
        this.studentName = studentName;
        System.out.println("Student constructor with two prameters:"+parentName);
    }
}
