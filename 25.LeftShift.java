import java.util.Scanner;
class LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Showcasing LeftShift operators");
        System.out.print("Enter Your Number: ");
        int a = input.nextInt();
        int result = a << 4;
        System.out.println(result);
    }
}
