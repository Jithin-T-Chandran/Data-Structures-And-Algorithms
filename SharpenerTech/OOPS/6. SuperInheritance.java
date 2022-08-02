//Use super method to call parent constructor


/******************************************************************************

Create a class named 'Member' having the following members:

Data Attributes of Member Class

1 - Name

2 - Age

3 - Phone number

4 - Address

5 - Salary

It also has a method named 'printSalary' which prints the salary of the members.

Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' 
and 'Manager' classes have attributes 'specialization' and 'department' respectively. 
Now, assign name, age, phone number, address and salary to an employee and a manager 
by making an object of both of these classes and print the same.

*******************************************************************************/
class Member{
    String name;
    int age;
    long phoneNumber;
    String address;
    long salary;
    
    Member(String name,int age,long phoneNumber,String address,long salary){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    
    void printSalary(){
        System.out.println("Salary "+this.salary);
    }
}

class Employee extends Member{
    String specialization;
    Employee(String name,int age,long phoneNumber,String address,long salary,String specialization){
        super(name,age,phoneNumber,address,salary);
        this.specialization = specialization;
    }
}

class Manager extends Member{
    String department;
    Manager(String name,int age,long phoneNumber,String address,long salary,String department){
        super(name,age,phoneNumber,address,salary);
        this.department = department;
    }
}

public class Main
{
	public static void main(String[] args) {
		Employee ob1 = new Employee("Jithin",25,755885,"Kanhangad",70000,"Developer");
		Manager ob2 = new Manager("Akshay",24,98955,"Bakel",90000,"Accountant");
		ob1.printSalary();
		ob2.printSalary();
	}
}
