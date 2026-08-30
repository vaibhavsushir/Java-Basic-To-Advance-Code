import java.util.Scanner;
class GreatestNumber{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Check Greatest Number Checker/n");
        System.out.print("Please enter Your First Number: "); 
        int a=input.nextInt();
        System.out.print("Please enter Your Second Number: ");
        int b=input.nextInt();
        System.out.print("Please enter Your Third Number: ");
        int c=input.nextInt();
        if(a >= b && a>=c ){
            System.out.print("Greatest Number Is: "+ a);
        }else if(b>=a && b>=c){
            System.out.print("Greatest Number Is: "+ b);
        }else{
            System.out.println("Greatest Number Is: "+ c);
        }
    }
}
