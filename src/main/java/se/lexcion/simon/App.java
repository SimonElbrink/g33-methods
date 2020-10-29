package se.lexcion.simon;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) {
       welcomeMessage();

        printOut("name","Simon");
        printOut("age", "23");

       double result = addition(2015334534, 605434533);
        System.out.println(result);


    }

    // Method need to be inside a class.
    //Access modifier
    //Static / Instance?
    //Return Type
    //Name of method
    //parameters
    //method body
   public static void name(){}


   //Returns nothing, no parameters
    public static void welcomeMessage(){
        System.out.println("Hello World - From Method");
    }

    // Returns nothing, have two parameters.
    public static void printOut(String what, String value){
        System.out.print("The " + what +" is: ");
        System.out.println(value);
    }

    public static double addition(double number1, double number2){
        //preparing variables to be used in method
        double result;

        //preforms the action of method
        result = number1 + number2;

        //Returns the result of the calculation.
        System.out.println(result);
        return result;
    }

    /**
     * Checking if adult.
     * Your a adult when your age is 18 or above.
     * @param age
     * @return true if adult.
     */
    public static boolean isAdult(int age){

        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }


}