package controlFlow;

import java.util.*;

public class cf {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();

        //user-input
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you name: ");
        String name = scan.nextLine(); 
        System.out.println("Hello " + name);

        System.out.println("Do you wish to continue to the interactive portion?");
        String response = scan.nextLine();
        Boolean end = false;
        if(response.toLowerCase().equals("yes") || response.toLowerCase().equals("y")) {
            //continue
                while(!end) {
                    System.out.println("What is the name of your favorite pet? If you don't have a pet, make one up!");
                    String petName = scan.nextLine();
                    System.out.println("What is the age of your favorite pet? If you don't have a pet, make one up!");
                    int petAge = scan.nextInt();
                    System.out.println("What is your lucky number? We need it to generate your lottery number!");
                    int luckyNum = scan.nextInt();
                    System.out.println("Do you have a favorite quarterback? (if none, input no/n) If so what is their jersey number?");
                    scan.nextLine();    //reads the newline
                    String quarterBackAns = scan.nextLine();
                    int quarterBackNum=0;
                    if(quarterBackAns.toLowerCase().equals("no") || quarterBackAns.toLowerCase().equals("n")) {
                        //no favorite quarterback
                    }
                    else {
                        quarterBackNum = Integer.parseInt(quarterBackAns);
                    }
                    System.out.println("What is the two-digit model year of your car?");
                    int modelYear = scan.nextInt();
                    System.out.println("What is the first name of your favorite actor or actress?");
                    scan.nextLine();
                    String favoriteA = scan.nextLine();
                    System.out.println("enter a random number between 1 and 50");
                    int randNum = scan.nextInt();


                    //random numbers
                    int rand1, rand2, rand3;
                    rand1 = (int)Math.ceil(75 * Math.random()) + 1;
                    rand2 = (int)Math.ceil(75 * Math.random()) + 1;
                    rand3 = (int)Math.ceil(75 * Math.random()) + 1;

                    int chooseQBOrLN = (int)Math.ceil(100 * Math.random()) + 1;
                    int magicBallNum;
                    if(chooseQBOrLN < 50) {
                        magicBallNum = (rand1 + quarterBackNum) % 75;
                    } 
                    else  {
                        magicBallNum = (rand2 + luckyNum) % 75;
                    }

                    int lotto1, lotto2, lotto3, lotto4, lotto5;
                    lotto1 = (int)Math.ceil(50 * Math.random()) + 1;
                    lotto2 = (int)Math.ceil(75 * Math.random()) + 1;
                    lotto3 = (int)Math.ceil(75 * Math.random()) + 1;
                    lotto4 = (int)Math.ceil(75 * Math.random()) + 1;
                    lotto5 = (int)Math.ceil(75 * Math.random()) + 1;

                    System.out.println("Lottery Numbers: " + lotto1 + ", " + 
                    lotto2 + ", " + lotto3 + ", " + lotto4 + ", " + lotto5 + " Magic Ball: " + magicBallNum);

                    System.out.println("Play again?");
                    scan.nextLine();
                    response = scan.nextLine();
                    if(response.toLowerCase().equals("yes") || response.toLowerCase().equals("y")) {

                    }
                    else {
                        end = true;
                        System.out.println("Thank you");
                    }
                }
        }
        else {
            //quit program
        }
    }
}
