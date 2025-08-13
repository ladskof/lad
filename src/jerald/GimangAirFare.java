package jerald;

import java.util.Scanner;

public class GimangAirFare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Distance(km): ");
        int distance = scanner.nextInt();

        System.out.print("Enter The Class: ");
        int classType = scanner.nextInt();

        int farePerKilometer = 0;
        double totalFare;

        if (classType == 1) {
            farePerKilometer = 250;  
        } else if (classType == 2) {
            farePerKilometer = 500;  
        } else {
            System.out.println("Invalid class selection.");
            return;
        }

        totalFare = farePerKilometer * distance;

        if (distance > 1000) {
            totalFare -= totalFare * 0.10;
        }


        System.out.printf("Total fare: %.2f%n", totalFare);
       
        scanner.close();
    }
}
