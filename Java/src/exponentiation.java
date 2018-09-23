import java.util.Scanner;

public class exponentiation {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
         int numb = in.nextInt();
        System.out.print("Enter the degree of number:");
        int deg =in.nextInt();

        int resul = func(numb,deg);
        System.out.println(resul);
    }

    public static int func (int a ,int b){
        int result =1;
        for (int i=0;i<b;i++){

            result*=a;

        }
        return result;
    }
}
