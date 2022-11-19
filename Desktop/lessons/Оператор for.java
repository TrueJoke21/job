import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i <=n;i++){
            int k= sc.nextInt();
            System.out.print(k+ " ");
        }
    }
}