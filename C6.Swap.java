import java.util.Scanner;
class Swap {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in) ;
        System.out.println("Welcome To Swaping Station\n");
        System.out.print("Enter The value Of A: ");
        int a =input.nextInt();
        System.out.print("Enter The value Of B: ");
        int b=input.nextInt();

        int c=a;
        a=b;
        b=c;

        System.out.println("Value Of A after Swapping Is: "+a);
        System.out.println("Value Of B After Swapping Is: "+b);
    }
}
