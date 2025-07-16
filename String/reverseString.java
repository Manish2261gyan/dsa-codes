package String;

import java.util.Scanner;

public class reverseString {

    public static void reverseString(String str) {
        char[] copy = new char[str.length()];
        int i = 0;
        int j = str.length() - 1;

        while (j >= 0) {
            copy[i] = str.charAt(j);
            i++;
            j--;
        }

        System.out.println("Reversed string: " + new String(copy));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.next();
        reverseString(str);
        sc.close();
    }
}
