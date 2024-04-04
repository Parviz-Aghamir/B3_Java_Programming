package day04_variables;

public class Olympics {
    /*
class name Olympics

    create a variable for the year
    print the country and year for next couple events
    reassign year value each time. Country name is hard coded

    data:

        China 2022
        France 2024
        Italy 2026

    Look forward to the year $year for the Olympics to be in $location

 */


    public static void main(String[] args){
        System.out.println("Olympics have been and will be held in these countries ");

        int year = 2022;
        System.out.println("\tLook forward to the year " + year +  " for the Olympics to be in China");

        year=year+2;

        System.out.println("\tLook forward to the year " + year +  " for the Olympics to be in France");

        year=year+2;

        System.out.println("\tLook forward to the year " + year +  " for the Olympics to be in Italy");





    }


}
