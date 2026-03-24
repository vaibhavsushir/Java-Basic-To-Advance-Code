import java.util.Scanner;
class OddSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Odd Sum Calculator\n");
        System.out.print("Enter Your Number: ");
        int num =input.nextInt();;
        int result = sum(num);;
        System.out.println("Your sum is : "+ result);
    }
    public static int sum(int num){
        int sum = 0;
        int i = 1;
            while(i <= num){
            sum = sum + i;
            i = i + 2 ;
            }
        return sum;
    }
}
