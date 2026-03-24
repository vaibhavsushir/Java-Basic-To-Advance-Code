import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome To multiplication World\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number: ");
        int a = input.nextInt();
        System.out.println("Multiplication Table Is");
        PrintMultiplicationTable(a);
    }

    public static int PrintMultiplicationTable(int a) {
        int i = 1;
        while (i <= 10) {
            int result = i * a;
            System.out.println(result);
            i++;
        }
        return i;
    }
}

