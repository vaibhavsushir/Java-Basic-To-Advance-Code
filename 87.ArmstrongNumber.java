import java.util.Scanner;
class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome To Armstrong Number Calculator");
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        boolean Isarmstrong = isarmstrong(num);;
        if(Isarmstrong){
            System.out.println("Your Number Is Armstrong Number");
        }else{
            System.out.println("Your Number Is Not Armstromg Number");
        }
    }
    public static boolean isarmstrong(int num){
        int noofdigits=Noofdigits(num);
        int numcopy=num;
        int finalnumber=0;
        while( num > 0){
            int lastDigits= num % 10;
            num /= 10;
            finalnumber += pow(lastDigits,noofdigits);
        }
        return finalnumber == numcopy;
    }
    public static int pow(int num1,int num2){
        int result=num1;
        int i = 0;
        while(i<num2){
            result *= num1;
            i++;
        }
        return result;
    }
    public static int Noofdigits(int num){
        int digit=0;;
        while(num>0){
            digit++;;
            num /= 10 ;
        }
        return digit;

    }
}
