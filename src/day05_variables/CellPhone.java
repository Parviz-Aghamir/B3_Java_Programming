package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        /*
    create a class CellPhone
    create a main method
    declare and assign these variables:
        brand, model, color, price, storage, hasCamera, sim(char A, B, C)

    Print all the variables

        sample data: apple, iphone 10, black, 1000.99, 128, true, A
 */

       String brand = "Apple";
       String model = "Iphone 14 Pro";
       String colour = "Red";
       double price = 799.99;
       int storage = 256;
       boolean hasCamera = true;
       char sim = 'A';

       System.out.println("I have an " + model + " from " + brand);
        System.out.println("It came in the colour " + colour + " and it has " + storage + "GB");
        System.out.println("For the sim type " + sim + "with a camera: " +hasCamera + ", the total price is $"+price);



        // 2nd approach
        System.out.println();
        String fullMessage = "I have an " + model + " from " + brand + ". \nIt came in the color " + colour + " and it has " +  storage+ " GB. \nFor the sim type " + sim + " with a camera: " + hasCamera + ", the total price is $" + price;


        System.out.println(fullMessage);




    }

}
