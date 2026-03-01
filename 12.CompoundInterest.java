import java.util.Scanner;
class CompoundInterest {
    public static void main(String[] args) {
        System.out.println("Welcome To Compound Interest Calculator");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Principle Amount: ");
        int a=input.nextInt();
        System.out.print("Enter Rate Of Interest: ");
        float b=input.nextInt();
        System.out.print("Now,Tell How Many Years You Borrowing Money: ");
        float c= input.nextInt();
        double CI=a*Math.pow((1+b/100),c);;
        System.out.println("Compound Interest Is: "+CI);
    }
}
