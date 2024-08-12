package com.oops;

import java.util.Scanner;

class Student{
	int registrationNumber;
	String studentName;
	int Subject[] =new int[5]; 
	
	Student(int registrationNumber, String studentName){
		this.registrationNumber=registrationNumber;
		this.studentName=studentName;
	}
	void getMarks() {
		
		Scanner sc =new Scanner (System.in);
		for(int i=0;i<Subject.length;i++) {
			Subject[i] =sc.nextInt();
		}
	}
	void displayGrade() {
		System.out.println("Student ID :"+ registrationNumber);
        System.out.println("Student Name :"+ studentName);
		int sum= 0;
		for(int i=0;i<Subject.length;i++) {
			
			sum=sum+Subject[i];
		}
		System.out.println("Sum :" + sum);
		
	}
}

public class Assignment {

	public static void main(String[] args) {
		
		Student mark = new Student(101, "Prathi");
		mark.getMarks();
		mark.displayGrade();
		

	}

}
