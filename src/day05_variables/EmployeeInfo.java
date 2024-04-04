package day05_variables;

/*
    create a class EmployeeInfo
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are they full time, job title, salary, number of pto (0-25), are they married, suite(char - A, B, C, D)

    Print all the variables
 */

public class EmployeeInfo {

    public static void main(String[] args) {
//        String firstName;
//        String lastName;
//        String companyName;
//        String jobTitle;
        // As long as the variable share the SAME data type, we can declare them like this as well.
        String firstName, lastName, companyName, jobTitle;

//        char suite;
//        char gender;
        char suite, gender;

        double salary;
//        int pto; // Paid Time Off - day for vacation
//        int age;
        int age, pto; // Paid Time Off - day for vacation
//        boolean isMarried;
//        boolean isFullTime;
        boolean isFullTime, isMarried;
        firstName = "Parviz";
        lastName = "Aghamir";
        companyName = "BakuPainting";
        jobTitle = "CEO";
        pto = 0;
        salary = 180_000;
        isFullTime = true;
        isMarried = true;
        suite = 'A';
        gender = 'M';

        String fullDetail = "Employment Information for: "+firstName+ " "+ lastName + "\n\tGender: \t\t"+gender;
        System.out.println(fullDetail);


    }
}
