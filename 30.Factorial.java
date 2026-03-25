import java.util.Scanner;
class Factorial {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To factorial");
        System.out.print("Enter Your Number: ");
        int a=input.nextInt();;
        long fact=factorials(a);
        System.out.println("Factorial Is: "+fact);
    }
public static long factorials(int a){
        if(a<2) {
            return 1;
        }
        long fact=1;
        int i=2;
        while(i<=a){
            fact *= i;
            i++;;
        }
        return fact;
    }
}
