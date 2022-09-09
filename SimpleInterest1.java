package com.lulu.assessment;

public class SimpleInterest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				int principal = 10000;
				float time = 1.5f;
				float interest = 2.5f;
				
				
				float SI;
				SI =(principal*time*interest)/100;
				float total = SI+principal;
				System.out.println("simple interest is " + SI);	
				System.out.println("Total amount to be paid " + total);
			
		}

	}
