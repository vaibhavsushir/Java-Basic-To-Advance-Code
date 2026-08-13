import java.util.Scanner;
class OddEven{
    public static void main(String[] args) {
        System.out.println("Welcome To Check Odd Even Number Checker");
        Scanner input=new Scanner(System.in);;
        System.out.print("Enter The Number: ");
        int a=input.nextInt();;
        if(a % 2 == 0){
            System.out.println("Even Number") ;
        }else{
            System.out.println("Odd Number");
        }
    }
}

