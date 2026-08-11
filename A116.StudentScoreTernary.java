import java.util.Scanner;
class StudentScoreTernary{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Categories Student Score\n");
        System.out.print("Enter Your Score: ");
        int score = input.nextInt();
        String result = score > 80 ? "High" : (score > 50 ? "Moderate" : "Low"); 
        System.out.println("Your Grade Is: " + result); 
    }
}
