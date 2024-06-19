// package com.example;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.print("Guess the number ___");
        while(true){
            int gusssedNumber = scanner.nextInt();
            if (gusssedNumber==randomNumber){
                System.out.println("Your guess is correct");
            }
            else if(gusssedNumber<randomNumber){
                System.out.println("Guess higher");
            }
            else{
                System.out.println("Guess lower");
            }
            
            // System.out.println("The number is" + randomNumber);
            System.out.println("Press 999 to exit");
            if (gusssedNumber==999){
                break;
            }
            
        }
    }
}