import java.util.Scanner;
class AbsoluteTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Absolute Value");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        int result = num > 0 ? num : (-num);
        System.out.println("Absolute Number Is:"+result);
    }
}
