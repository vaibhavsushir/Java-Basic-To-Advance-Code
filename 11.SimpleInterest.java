import java.util.Scanner;
class SimpleInterest {
    public static void main(String[]args){
        System.out.println("Welcome To Simple Interest Calculator");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Principle Amount:");
        int a=input.nextInt();
        System.out.print("Now,Enter Rate Interest: ");
        int b=input.nextInt();
        System.out.print("Now,Tell" +
                "how many years you borrowing money: ");
        int c=input.nextInt();
        double interest=(a*b*c)/100;
        System.out.println("Your Simple Interst Is:"+interest);
    }
}
