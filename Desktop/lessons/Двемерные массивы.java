import java.util.ArrayList;
import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        int[][] arr = new int[a][b];

        int s=0;

        for(int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                s += arr[i][j];

            }

        }
        System.out.println(s);
    }
}