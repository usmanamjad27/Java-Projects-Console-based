//Scenario 3: Employee Management System
//A company is designing an Employee Management System. Each employee has an Address, which
//consists of street, city, and zipCode. The Employee class should contain an Address object, demonstrating
//        Composition.
//Problem Statement:
//         Implement an Address class with appropriate attributes and a constructor.
//         Implement an Employee class with an Address field, a constructor for initialization, and a
//displayInfo() method.
//         Demonstrate creating an Employee object with an Address and printing its details.
//

public class S3_Employee_Management_System {
    public static void main(String[] args) {
        S3_Address Usman = new S3_Address("B651/- street no 5 ","Pakpattan",57400);
        S3_Employee usman = new S3_Employee(Usman,"67","Usman Amjad");
        usman.displayInfo();

    }
}
