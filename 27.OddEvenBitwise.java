import java.util.Scanner;
class OddEvenBitwise {
    public static void main(String[] args) {
        System.out.println("Welcome To Odd Even Bitwise Calculator");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int a=input.nextInt();
        if((a & 1) ==1){
            System.out.println("Your Number Is Odd");
        }else{
            System.out.println("Your Number Is Even");
        }

    }
}


