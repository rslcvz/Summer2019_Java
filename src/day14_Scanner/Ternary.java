package day14_Scanner;

public class Ternary {

	public static void main(String[] args) {

		 int num = 0;
		
		 if (true) 
			num = 100;
		 else 
			num = 50; 
		
		int n = (false)? 100 : 50;
		int y = (false)? 100 : 50;
			
		 
	    System.out.println(num);  // 100
		System.out.println(n);   // 50
		System.out.println(y);   // 50
		
		String schoolName = "";
		boolean batch12 = true;
		
		if (batch12) {
			schoolName = "Cybertek";
			
		} else {
			schoolName = "Invalid";
		}
		
		System.out.println(batch12 ? "Cybertek" : "Invalid");
		
		String bestSchool = batch12 ? "Cybertek" : "Invalid";
		System.out.println(bestSchool);
		
		double interestRate = 0;
		boolean goodCredit = true;
		
	interestRate = (goodCredit == true) ? 0.5 : 0.9;
	System.out.println(interestRate);
	
	byte grade = 60;
	boolean passed = grade >= 60 ? true : false;
	System.out.println(passed);
	
	char finalGrade = 'A';
	String group = "";
	
	/*  if (finalGrade == 'A') {
		group = "Early bird";
	}else if (finalGrade == 'B') {
		group = "Group 1";
		
	}else if (finalGrade == 'C') {
		group = "Group 2";
	}else {
		group = "After group 2";
		
		group = finalGrade == 'A' ? "Early bird" : finalGrade == 'B' ?
				"group 1" : "After group 1" ;
		System.out.println(group);  
		
		group = (finalGrade == 'A') ? "Early Birds"
				: (finalGrade == 'B') ? "Group 1"
						:(finalGrade == 'C') ? "Group 2"
		                   : "After Group 2";
		System.out.println(group);    
	
	int score = 80;
	char finals = ' ';
	
	if (score >= 90 && score <= 100) {
		finals = 'A';
		else if (score >= 80 && score <= 89)
			finals = 'B';
		else if (score >= 70 && score <= 79)
			finals = 'B';
		else if (score >= 60 && score <= 69)
			finals = 'B';
		else if (score >= 0 && score <= 89)
			finals = 'B';*/
	 
	int score = 90;
	char finals = 'C';
	        
	        finals = (score >= 90 && score <= 100) ? 'A'
	                            : (score >= 80 && score < 89) ? 'B'
	                                    : (score >= 70 && score < 79) ? 'C'
	                                            : (score >= 60 && score < 69) ? 'D'
	                                                    : 'F';
	        System.out.println(finals);
	        
	        int n1 = 100, n2 = 300, n3 = 400;
	        
	        int max = (n1 > n2 && n1 > n3) ? n1 
	        		: (n2 > n1 && n2 > n3) ? n2
	        				: n3;
	        System.out.println(max);
	}
	}
	
	


