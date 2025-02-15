package day04_variables;


/*
    Data Types:
        Primitive - total 8
            integer types:      byte - short - int - long
            floating types:     float - double
            character:          char
            true/false:         boolean
        Non-Primitive
            String:             Multiple characters
 */


public class PrimitiveDataTypes {

    public static void main(String[] args){

        byte age = 60;
        System.out.println("age"); // age
        System.out.println(age);   // 60  ---> datatype is byte
        System.out.println(60);    // 60 ---> datatype is int

        // byte age2 = 200; // 200 is too big for byte datatype

        short year; // declared a variable called year which has datatype short
        year = 2024; // assigned a value, 2024, into my variable called year
        System.out.println(year);  // datatype here is: short
        System.out.println(2024);  // datatype here is: int

        int addressNumber = 244432;
        System.out.println(addressNumber);  // datatype here is: int
        System.out.println(244432);         // datatype here is: int

        long bigNumber;
        bigNumber = 9534663465633L;  // adding L to the end of number, tells the compiler it is a long number
















    }


}
