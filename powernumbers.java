import java.util.Scanner;

public class powernumbers{

    static int power(int a, int b){

        int total = 1;

        for(int i = 1; i <= b; i++){

            total *= a;


        }

        return total;
    }
    
    public static void main(String[] args) {

        int a, b;

        Scanner value = new Scanner(System.in);

        System.out.print("Enter First Number : ");

        a = value.nextInt();

        System.out.print("Enter Second Number : ");

        b = value.nextInt();


        System.out.println("Result : " + power(a, b));

    }
}
