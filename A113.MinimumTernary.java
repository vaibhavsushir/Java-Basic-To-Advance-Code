import com.sun.security.jgss.GSSUtil;

import java.util.Scanner; 
class MinimumTernary {
    public static void main(String[] args) {
        System.out.println("Welcome To Find Minimum Number\n"); 
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        int greatestnumber = num1 > num2 ? num1 : num2;;
        System.out.println(greatestnumber+ " Is Greatest Number");

    } 
}
 
