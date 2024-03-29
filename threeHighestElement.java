// Write a java program to find the largest three elements in an array and print them in descending order.

import java.util.Arrays;
import java.util.Scanner;

public class threeHighestElement {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the length of array :- ");
        int n=sc.nextInt();
        int [] a= new int[n];

        for(int i=0;i<a.length;i++){
            System.out.print("Enter the element of array :- ");
            a[i]=sc.nextInt();
        }
        System.out.println("Result of three highest number in descending order is :- ");
        Arrays.sort(a);
        for(int i=a.length-1;i>=a.length-3;i--){
            System.out.println(a[i]);
        }
    }
}
