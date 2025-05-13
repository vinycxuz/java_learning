import java.util.*;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        String s;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = in.nextLine();
        System.out.println(s);

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}