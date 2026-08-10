import java.util.Scanner;
class AgeCalculator {
    public static void main(String[] args){
        System.out.println("Welcome To Age Calculator Of Person");
        Scanner input=new Scanner(System.in);
        System.out.print("Please,Enter Your Age: ");
        int a=input.nextInt();;
        if(a>=65){
            System.out.println("You Are Senior Citizen");
        }else if(a>=20){
            System.out.println("You Are Adult");
        }else if(a>=13){
            System.out.println("You Are Teenager");
        }else{
            System.out.println("You Are child");
        }
    }
}

