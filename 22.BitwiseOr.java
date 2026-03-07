import java.util.Scanner;
class BitwiseOr {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Showcasing Bitwise And Operators");
        System.out.print("Enter First Number: ");
        int a=input.nextInt();;
        System.out.print("Enter Second Number: ");
        int b=input.nextInt();;

        int result=a | b ;
        System.out.println("Bitwise Number Is : "+result);

    }
}
