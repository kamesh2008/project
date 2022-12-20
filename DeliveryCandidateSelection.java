// delivery company candidate selection java project-nested loop;

import java.util.Scanner;

public class DeliveryCandidateSelection{
	public static void main(String args []){
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Select the gender  male ='m' or female='f'");
	System.out.println("Enter the gender : "); 
	char gender =sc.next().charAt(0);
      if(gender=='M' || gender=='m' ){
		  System.out.println("Enter your age");
		  int age=sc.nextInt();
		  if(age>=18){
			  System.out.println("Do you have Driving License");
			  System.out.println("'Yes press =Y' or 'No press'=N");
			  char license =sc.next().charAt(0);
			  if(license=='Y' || license=='y'){
				  System.out.println("your eligble for this job ");
				  System.out.println("Enter your Email ID");
				  while(true){
				  sc.nextLine();
				  String Email=sc.nextLine();
				  System.out.println("Your Email ID :"+Email+" is correct?");
				  System.out.println("'Yes press =Y' or 'No press'=N");
				  char press=sc.next().charAt(0);
				  if(press=='Y'||press=='y'){
						  System.out.println("All the Best! other details send your Email."); 
						  break;
					   }
					   else if(press=='N'||press=='n'){
						   System.out.println("Enter your email id again");
					   }
					   else {
						   System.out.println("invalid key");
						   break;
					   }
				  }
			  }
			  else if(license=='N' || license=='n'){
				  System.out.println("Driving license must! Your not Eligble");
			  }
			  else {
				  System.err.println("invalid key");
			  } 
		  }
		  else {
			  System.out.println("Age above 18 is neccessary. you are not Eligble ");
		  }
	  }
	  else if(gender=='F' || gender=='f'){
		  //Night delivery also possible for this role so female candidates not applicable.
		  System.out.println("Female Candidates not Eligible for this role");
	  }
	  else{
		  System.err.println("Invalid Key");
	  }	
	}
}