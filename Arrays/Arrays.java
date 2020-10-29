package Arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

//        Q. take input from the array size of student marks and
//        find average of the marks of the students.
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the number of the students:");
        int n = sc.nextInt();

        int[] studentMarks = new int[n];
        for (int i=0; i<n; i++){
            System.out.printf("Student Marks of %d is:",i+1);
            studentMarks[i]=sc.nextInt();

           }
        float averageMarks = 0;
        for( int i=0; i<n; i++){

            averageMarks+=(float) studentMarks[i];

        }
        averageMarks /= n;
        System.out.printf("Avg. of all student Marks is:%.2f",averageMarks);


    }
}
