import java.util.Scanner;
class LCM {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);;
        System.out.println("WElcome To LCM Number Calculation");
        System.out.print("Enter Your First Number: ");
        int a=input.nextInt();
        System.out.print("Enter Second Number: ");
        int b=input.nextInt();;
        int lcm=LCM(a,b);
        System.out.println("LCM of Two Number Is:"+lcm);
    }
    public static int LCM(int a,int b){
        int i = 1;
        while (true) {
            int factor = b * i;
            if (factor % a == 0) {
                return factor;
            }
            i++;
            ;
        }
    }
}
