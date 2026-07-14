import java.util.Scanner;
class PrimeFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcoe To Check Number Is Prime Or Not\n");
        System.out.print("Enter Your Number: ");
        int num = input.nextInt();
        System.out.print("Your Number Is "+ (IsPrime(num) ? "Prime" : "Not Prime")); 
    }
        public static boolean IsPrime(int num){
                    for(int i=2 ; i < num ; i++){
                        if(num % i == 0){
                          return false;
                }
        }
            return true;
    }
}
