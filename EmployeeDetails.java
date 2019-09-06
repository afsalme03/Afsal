/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedetails;

import java.io.*;
import java.util.ArrayList;

class Employee {

    int age;
    double salary;
    String name;

    void SetData() {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String s;
            System.out.println("Enter Employee Name");
            name = bf.readLine();
            System.out.println("Enter Employee Age");
            s = bf.readLine();
            age = Integer.parseInt(s);
            System.out.println("Enter Employee Salary");
            s = bf.readLine();
            salary = Double.parseDouble(s);
        } catch (IOException e) {
        }
    }

    void ShowData() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);
    }
}

class EmployeeDetails {

    public static void main(String args[]) {
        int ch, i , c=1 , age=0 , count=0;
        float avg;
        ArrayList<Employee> employeelist = new ArrayList();
        do{
        System.out.println("Enter Your Choise \n 1. Add Employee \n 2. List All Employee \n 3. List Eployee With Salary Greater Than 3000 \n 4. Print the Average age of Employee whose salary greater than or equal to 3000 \n");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try{
        s = bf.readLine();
        ch = Integer.parseInt(s);
       
            switch (ch) {
                case 1:
                    Employee emp = new Employee();
                    emp.SetData();
                    employeelist.add(emp);
                    break;
                case 2:
                    for(Employee emp1: employeelist){
                        emp1.ShowData();
                    }
                break;
                case 3:
                    for(Employee emp2: employeelist){
                        if(emp2.salary>=3000)
                        {
                        emp2.ShowData();
                        }
                    }
                break;
                case 4:
                    for(Employee emp3: employeelist){
                        if(emp3.salary>=3000)
                        {
                        emp3.ShowData();
                        age=age+emp3.age;
                        count++;
                        }
                    } 
                    avg=age/count;
                    System.out.println("The average age is "+avg+" \n");
                break;
                default:
                    System.out.println("Invalid Choice");
                break;
                
            }
            System.out.println("If you want to continue press 1 else 0 ");
            s = bf.readLine();
            c = Integer.parseInt(s);
            }catch(Exception ex){}        
        }while(c==1);
    }
}
    
