/******************************************************************************
Write a Program to create a Class Employee
It contains two attributes -> Name, Salary
Create 5 objects and initialize any random values for Name and Salary to it.
Store all these objects in an Array and print the names of the employees sorted 
in Descending Order of Salary using any of the sorting mechanism.
(bubble Sort, Insertion Sort or selection Sort).
*******************************************************************************/
public class Main
{
     static class Employee1 {
          String name;
          Double salary;
          Employee1(String name,Double salary){
            this.name = name;
            this.salary = salary;
      }
      public void printSalary(){
        System.out.println("Salary of "+name+" :"+salary);
      }
     }
    
	public static void main(String[] args) {

		Employee1[] ob = new Employee1[5];
		ob[0] = new Employee1("Jithin",34554.0);
        ob[1] = new Employee1("Hari",7437.0);
        ob[2] = new Employee1("Milind",56353.0);
        ob[3] = new Employee1("Harsha",16784.0);
        ob[4] = new Employee1("Robin",96276.0);
        
        	//USING BUBBLESORT
          int n = ob.length;
          Employee1 temp;
          for (int i = 0; i < n - 1; i++){
             for (int j = 0; j < n - i - 1; j++){
               if (ob[j].salary < ob[j + 1].salary) {
                 temp = ob[j];
                 ob[j] = ob[j + 1];
                 ob[j + 1] = temp;
                }
               }
           }
            //PRINTING SALARY
           for(int i=0;i<ob.length;i++){
             ob[i].printSalary();
           }
	}

}
