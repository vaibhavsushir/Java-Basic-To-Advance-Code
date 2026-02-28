import java.util.Scanner;
class FloatMultiplication {
    public static void main(String[]args){
        System.out.println("Multiplication of Float Number\n");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Float Number: ");
        double a=input.nextDouble();
        System.out.println("Enter Second Number: ");
        double b=input.nextDouble();

        double mul=a*b;
        System.out.println("Multiplication Is: "+mul);


    }
}
