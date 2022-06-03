package with_ide;

import java.util.Arrays;

public class Q8 {
    public static void main(String[] args) {
        int i [] [] = {
                {1 ,2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {7, 8, 9, 1, 5, 7, 7},
        };

        for (int a = 0 ; a < i.length ; a++) {
            for (int b = 0 ; b < i[a].length ; b++) {
                System.out.print(i[a][b] + " ");
            }
            System.out.println();
        }
    }
}
