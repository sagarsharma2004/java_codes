import java.util.Arrays;
import java.util.Scanner;

public class anagram{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the first string:- ");
        String s=sc.nextLine();
        s=s.replaceAll("//s", "").toLowerCase();
        char [] c=s.toCharArray();
        Arrays.sort(c);
        System.out.print("Enter the second string:- ");
        String s2=sc.nextLine();
        s2=s2.replaceAll("//s", "").toLowerCase();
        char [] c2 =s2.toCharArray();
        Arrays.sort(c2);

        if(Arrays.equals(c,c2)){
            System.out.println("yes, the given strings are anagrams.");
        }else{
            System.out.println("No, the given strings are not anagrams.");
        }
    }
}