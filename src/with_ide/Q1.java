package with_ide;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        System.out.println("Add Number");
        int fact = 1 ;
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int b = 1 ; b <= num ; b ++) {
            fact *= b;
        }
        System.out.println(fact);

    }
}
