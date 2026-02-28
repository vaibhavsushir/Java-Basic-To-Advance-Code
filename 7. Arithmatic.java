import java.util.Scanner;
class Arithmatic {
    public static void main(String[]args){
        System.out.println("Welcome To Calculater");
        System.out.print("Enter First no: ");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        System.out.print(" Enter Second no: ");
        int b=input.nextInt();
        int c=a+b;
        System.out.println("Addition Is: " +c);
        int d=a-b;
        System.out.println("Subtraction Is: "+d);
        int e=a/b;
        System.out.println("division Is: "+e);
        int f=a*b;
        System.out.println("Multiplication Is: "+f);



    }
}
