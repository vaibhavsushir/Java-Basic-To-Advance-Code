import java.util.Scanner;
class ReverseTheNumber {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("WElcome to Reverse The Digits");
        System.out.print("Enter Your Number: ");
        int num=input.nextInt();;
        int Reverse=reverse(num); 
        System.out.println("Your Reverse Number Is: "+Reverse);
    }
    public static int reverse(int num){
        int newnumber=0;
        while(num>0){
            int digit=num % 10;
            newnumber=num*10+digit;;
            num /= 10;;
        }
        return newnumber;
    }
}
