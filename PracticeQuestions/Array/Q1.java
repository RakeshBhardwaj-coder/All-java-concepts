package PracticeQuestions.Array;
import java.util.Scanner;
//Q1.Find sum of all array elements.


public class Q1 {
     static class Solution {
      static int sum(int arr[], int n) {
            int sum = 0;
            int i;
            for (i=0; i<arr.length; i++){
                sum +=arr[i];
            }
            return sum;

        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();



            }


            System.out.println(sum(arr,n));

        }
    }

}
