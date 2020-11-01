package OOPs.StaticKeyword;

import java.sql.SQLOutput;

public class StaticKeyword {


    //Here I'm using some static Blocks,it's use for some place where we need
    // initialize something before the main function/methods
    static{
        System.out.println("This is Static Block1.");

    }
    static {
        System.out.println("This is static Block2.");
    }
    public static void main(String[] args) {
        //Here I'm creating object from the A class,go and check A class
        A objA = new A();
        A.B objB = objA.new B();
        A.C objC = new A.C();// not need to write objA.new because C is static Class.
        System.out.printf("I'm Main() function,\nAfter the static Blocks,Main() function is going to print.");  }
    static {
        System.out.println("this is static Block3");//this initialize first than main() function,not necessary, after it use of main function
    }
}
