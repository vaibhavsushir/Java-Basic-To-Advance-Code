import java.util.Scanner;
class NumberGuessingGame { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Number Guessing Game\n");
        int num=5,guess;
        do{
            System.out.print("Please,Guess Number Between 0 To 10: ");
            guess = input.nextInt();
        }while(num != guess);
        System.out.println("You Have Successfully Guess The Number");
    }
}
