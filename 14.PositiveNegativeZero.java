import java.util.Scanner;
class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome TO Number Checker");
        System.out.print("Enter Your Number: ");
        int no=input.nextInt();
        if(no>0){
            System.out.println("Your Number Is Positive");
        }
        else if(no ==0 ){
            System.out.println("Your Number Is Zero");
        }else{
            System.out.println("Your Number Is Negative");
        }
    }
}
