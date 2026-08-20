import java.util.Scanner;
class MultiplicationTableFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Multiplication Table Printer\n");
        System.out.print("Enter Number You Want To Print Multiplication Table: ");
        int num = input.nextInt();

        for(int i=1; i <= 10; i++){
            int table = i * num;
            System.out.println(i + " * " + num + " = "+ table);
        }
    }
}
