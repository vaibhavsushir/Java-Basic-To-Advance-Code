
import java.util.Scanner;
class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Welcome To Sum Of Digits");
        Scanner input=new Scanner(System.in);
        System.out.print("Please Enter Your Number: ");
        int a=input.nextInt();
        int sum=sumofdigit(a);;
        System.out.println("Sum Of Digits Is: "+sum);
    }
    
    public static int sumofdigit(int a) {
        int sum = 0;
        while (a > 0) {
            sum = sum + (a % 10);
            a = a / 10;
        }
        return sum;
    }
        }
