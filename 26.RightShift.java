import java.util.Scanner;
class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Showcasing RightShift operators\n");
        System.out.print("Enter Your Number: ");
        int a = input.nextInt();
        int result = a >> 1;
        System.out.println(result);
    }
}
