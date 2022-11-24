import java.util.Arrays;
import java.util.Scanner;

public class ProjectFirst {
    static Scanner input = new Scanner(System.in);

    public static void greeting() {
        /** None -> None
         First you’ll want to greet your user and ask them their name.
         Once you have their name use it to greet your user, and then ask them
         where they would like to go. Finally, tell you user their destination
         sounds like a great trip! All the code to accomplish Part 1 should be
         in its own method.
         */
        // write your code here
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name: ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
        String travelDestination = input.nextLine();
        System.out.println("Great! " + travelDestination + " sounds like a good trip");
    }

    public static void travelTimeBudget() {


        /* None -> None
         You’ll want to ask the user about how much time and money they are
         budgeting for their trip. Once you have all this info (stored in
         the correct variables), use it to tell the user the information given in
         sample output.
         */
        // write your code here
        System.out.print("How many days are you going to spend traveling? ");
        int daysInput = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip: ");
        double usdInput = input.nextDouble();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currencyInput = input.next();
        System.out.print("How many " + currencyInput + " are there in 1 USD? ");
        double conversionRateInput = input.nextDouble();

        System.out.println();

        double usdPerDay = (usdInput / daysInput) * 10;
        usdPerDay = (int) usdPerDay;
        usdPerDay /= 10;

        double convertedUsdPerDay = ((usdInput * conversionRateInput) / daysInput) * 100;
        convertedUsdPerDay = (int) convertedUsdPerDay;
        convertedUsdPerDay /= 100;


        //285.556730346
        //285556.352352
        //285556.0
        //285.556


        System.out.println("If you are traveling for " + daysInput + " days that is same as " + daysInput * 24 + " hours or " + daysInput * 24 * 60 + " minutes or " + daysInput * 24 * 60 * 60 + " seconds.");
        System.out.println("If you are going to spend $" + usdInput + " USD that means per day you can spend up to $" + usdPerDay + " USD");
        System.out.println("Your total budget in " + currencyInput + " is " + usdInput * conversionRateInput + " " + currencyInput + ", which per day is " + convertedUsdPerDay + " " + currencyInput);


    }

    public static void timeDifference(){

    /** None -> None
     you’ll need to ask the user about the time difference between their home and
     where they are going.
     */
    // write your code here
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int timeDifferenceInput = input.nextInt();
        int timeDifferenceInputNoon = timeDifferenceInput+12;
        if(timeDifferenceInput>=24) timeDifferenceInput %= 24;
        if(timeDifferenceInputNoon>=24) timeDifferenceInputNoon %= 24;
        System.out.print("That means that when it is midnight at home it will be " + timeDifferenceInput + ":00 in your travel destination and when it's noon at home it will be " + timeDifferenceInputNoon + ":00");
    }

    public static void countryArea() {
        /** None -> None
         Ask the user the area of their travel destination country in km2.
         Then you’ll want to convert that to miles2 and report those results back to the
         user.
         */
//    // write your code here
//    What is square area of your destination country in km2? 480
//    In miles2 that is 185.32
        System.out.print("What is square area of your destination country in km^2? ");
        double sqAreaInput = input.nextDouble()*0.38610215854245;
        int n = String.valueOf(sqAreaInput).indexOf(".");

        System.out.println("In miles^2 that is " + String.valueOf(sqAreaInput).substring(0,n+3));
    }

    public static void  nextDestination(){
        System.out.print("How many places you traveled to : ");
        int amoOfCountriesInput = input.nextInt();
        String[] countriesArrayInput = new String[amoOfCountriesInput];
        for(int i = 0; i<countriesArrayInput.length;i++){
            System.out.print("Enter the name: ");
            countriesArrayInput[i] = input.next();
        }
        System.out.print("Next place you want to travel to : \n");
        for(int i = 0; i<countriesArrayInput.length;i++){
            System.out.print(i + ": " + countriesArrayInput[i] +"\n");
        }
//        String nextPlaceInput = input.next();
        int nextPlaceInput = input.nextInt();
        System.out.println("Thank you, Your next location is: " + countriesArrayInput[nextPlaceInput]);
    }

    public static void main(String[] args)

    {
        //greeting();
//        travelTimeBudget();
//        timeDifference();
//    countryArea();
        nextDestination();

    }

}
