import java.util.Scanner;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome TO Prime Number Calculator");
        System.out.println("Enter Your Number: ");
        int a=input.nextInt();
        boolean isprime=IsPrime(a);
        if(isprime){
            System.out.println("Your Number is prime");
        }else{
            System.out.println("Your NUmber Is NOt Prime");
        }
    }
    public static boolean IsPrime(int a){
        int i=2;
        while(i<a){
            if(a%i==0){
                return false;
            }
            i++;;
        }
    return true;
    }
}
