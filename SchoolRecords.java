package com.lulu.assessment;
import java.util.Scanner;

public class SchoolRecords {

	Scanner sc = new Scanner(System.in);
	String schoolName = sc.next();
	int schoolID = sc.nextInt();
	String schoolAddress = sc.next();	
	void addRecords()
	{
		System.out.println("Records added");
		
	}
	void dispRecords()
	{

		System.out.println("Displaying Records:");
        System.out.println(schoolName);
        System.out.println(schoolID);
        System.out.println(schoolAddress);
	}
	
	
}
