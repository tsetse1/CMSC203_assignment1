/*
 * Class: CMSC203 
 * Instructor:
 * Description: intro to java
 * Due: 9/15/2021
 * Platform/compiler: vscode
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: __Theo Setse______
*/


import java.util.Scanner;

public class WiFiDiagnosis {
  
    public void troubleShootWiFi(){

    Scanner scaner = new Scanner(System.in);
    
    // step 1
    System.out.println("First step: reboot your computer");

    System.out.print("Are you able to connect with the internet? (yes or no): ");
        String choice = scaner.nextLine().trim();

    while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")){
        System.out.println("Please enter yes or no!\n");

        System.out.print("Are you able to connect with the internet? (yes or no): ");
            choice = scaner.nextLine().trim();
    }

    if(choice.equalsIgnoreCase("yes")){
        System.out.println("Rebooting your computer seemed to work");
        return;
    }
    
    // step 2
    System.out.println("Second step: reboot your router");

    System.out.print("Now are you able to connect with the internet? (yes or no): ");
        choice = scaner.nextLine().trim();

    while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")){
        System.out.println("Please enter yes or no!\n");
        System.out.print("Now are you able to connect with the internet? (yes or no): ");
        choice = scaner.nextLine().trim();
    }

    if(choice.equalsIgnoreCase("yes")){
        System.out.println("Rebooting your router seemed to work");
        return;
    }
    
    // step 3
    System.out.println("Third step: make sure the cables to your router are plugged in firmly and your router is getting power");

    System.out.print("Now are you able to connect with the internet? (yes or no): ");
        choice = scaner.nextLine().trim();

    while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")){
        System.out.println("Please enter yes or no!\n");

        System.out.print("Now are you able to connect with the internet? (yes or no): ");
            choice = scaner.nextLine().trim();
    }

    if(choice.equalsIgnoreCase("yes")){
        System.out.println("Checking the router's cables seemed to work");
        return;
    }
    
    // step 4
    System.out.println("Fourth step: move your computer closer to your router");

    System.out.print("Now are you able to connect with the internet? (yes or no): ");
        choice = scaner.nextLine().trim();

    while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no")){
        System.out.println("Please enter yes or no!\n");

        System.out.print("Now are you able to connect with the internet? (yes or no): ");
            choice = scaner.nextLine().trim();
    }

    if(choice.equalsIgnoreCase("yes")){
        System.out.println("Moving your computer closer to the router seemed to work");
        return;
    }
    
    // step 5
    System.out.println("Fifth step: contact your ISP\n"+ "Make sure your ISP is hooked up to your router.");
    }

    public class WiFiDiagnosisTest {
    
        public static void main(String[] args) {
        
        // print header
        System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.\n");
        
        // call wifi diagnosis function
        WiFiDiagnosis diagnosis = new WiFiDiagnosis();
            diagnosis.troubleShootWiFi();
        }
    }

}

