package Methods;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        sayHi();
        System.out.println("Enter two values:");
        //Methods is same as function but function is not a method
        //it similar to the main method
        //we use method where the same code use lots times
        Scanner i = new Scanner(System.in);
        int firstNumber=i.nextInt();
        int secondNumber=i.nextInt();
        int result = maxOf(firstNumber,secondNumber);
        System.out.printf("Your Big Value from %d and %d is:"+ result,firstNumber,secondNumber);
        System.out.printf("\nEnter again two values Here:");
        float thirdNumber = i.nextFloat();
        float fourthNumber=i.nextFloat();
        float result2=maxOf(thirdNumber,fourthNumber);
        System.out.printf("Your Big Value from %.1f and %.1f is:" + result2,thirdNumber,fourthNumber);

    }

    //Q. Here is the method for which is big of two numbers.

    static int maxOf(int a,int b){//static function call the static functions so we
        //need to make this static
        return a>b?a:b;
    }


    // creating here a void method its important
    static void  sayHi(){
        System.out.println("Hi!");
        System.out.println("good Morning ");
    }


    //here is doing Method Overloading-

    static float maxOf(float c, float d){//here I can't set same int,int type parameter
        //because the compile confuse in both maxOf methods.
        if(c>d){
            return c;
            }
        else return d;
    }



}
