import java.util.Scanner;
class PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Password Checker\n");
        String password;
    do{
        System.out.print("Please,Enter Your Password: ");
        password = input.next();
    }while(!IsValid(password));
        System.out.println("Thanks For Entering Valid Password");

    }
    public static boolean IsValid(String password){
        return password.length() > 6;
    }
}
