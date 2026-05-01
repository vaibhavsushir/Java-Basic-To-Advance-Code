import java.util.Scanner;
class OddEvenTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Odd Even Number Checker\n");
        System.out.print("Enter Your NUmber: ");
        int num = input.nextInt(); 
        String result =num % 2 ==0 ? "Even" : "Odd" ;
        System.out.print("Your Number Is : "+result); 


    }
}
