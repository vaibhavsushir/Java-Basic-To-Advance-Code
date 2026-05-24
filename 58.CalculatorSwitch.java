import java.util.Scanner;
class CalculatorSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Calculator\n");
        System.out.print("Enter First NUmber: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second NUmber: ");
        int num2 = input.nextInt();
        System.out.print("Enter Operation You Want To Perform On NUmber: ");
        String operation = input.next();

        int result =switch(operation){

            case "+" -> (num1 + num2);
            case "-" -> (num1 - num2);
            case "*" -> (num1 * num2);
            case "/" -> (num1 / num2);
            default -> -1;

        };
        System.out.println("Number "+operation+" Is: "+result);
    }
}
