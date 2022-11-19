import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int[] a = new int[b];
        for (int i = 0; i < b; i++) {
            int c = sc.nextInt();
            a[i] = c;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = b - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        for (int i = b - 1; i >= 0; i--) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}