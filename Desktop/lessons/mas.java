import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char [] b=new char[]{'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        char a= sc.next().charAt(0);

        if (a=='m'){
            System.out.print('q');
        }else{
            for(int i=0; i<=b.length; i++){
                        if(b[i]==a){
                            System.out.print(b[i+1]);
                            break;
                        }
            }
        }
    }
}