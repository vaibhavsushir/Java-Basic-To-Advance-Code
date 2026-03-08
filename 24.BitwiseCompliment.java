import java.util.Scanner;
class BitwiseCompliment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Showcasing Compliment operators");
        System.out.print("Enter Your Number: ");
        int a = input.nextInt();
        int result = ~a;
        System.out.println(result);
    }

}

