/******************************************************************************
Write a program by creating an 'Employee' class having the following methods 
and print the final salary.

1 - 'getInfo()' which takes the salary, number of hours of work per 
day of employee as parameter

2 - 'AddSal()' which adds 10 to salary of the employee if it is less than 500.

3 - 'AddWork()' which adds 5 to salary of employee if the number of hours 
of work per day is more than 6 hours.

*******************************************************************************/

import java.util.*;
class Employee{
    int salary;
    int hours;
   void getInfo(){
        Scanner sc = new Scanner(System.in);
        this.salary = sc.nextInt();
        this.hours = sc.nextInt();
   }
   void AddSal(){
       if(salary<500){
           salary+=10;
           System.out.println("Updated Salary "+salary);
       }else{
            System.out.println(salary);
       }
       
   }
   void AddWork(){
      if(hours>6){
           salary+=5;
             System.out.println("Hrs bonus Salary "+salary);
       }
     
   }
}

public class Main
{
	public static void main(String[] args) {
	    
	    Employee ob = new Employee();
	    ob.getInfo();
	    ob.AddSal();
	    ob.AddWork();
	   
	   
	}
}
