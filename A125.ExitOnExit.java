import java.util.Scanner;
class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Enter Your Command: ");
            String command = input.next();
            if( command.equals("Exit")){
                break;
            }
        } 
        System.out.println("You Have Successfully Exit");
    }
}
