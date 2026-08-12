import java.util.Scanner;
class LeapYear{
    public static void main(String[] args){
        System.out.println("Welcome To Leap Year Checker");
        Scanner input=new Scanner(System.in);;
        System.out.print("Enter Your Year you Want To Check: ");
        int year=input.nextInt();
        if(year % 400 == 0 || (year % 4==0 && year % 100 !=0 )){
                System.out.print("Your Year Is Leap Year");
            }else{
                System.out.println("Your Year Is Not Leap Year");
            }
        }
    }

