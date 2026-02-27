import java.util.Scanner;
    class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First no: ");
        int Fnumber = input.nextInt();
        System.out.print("Enter second no: ");
        Scanner myinput = new Scanner(System.in);
        int snumber = myinput.nextInt();
        int sum = Fnumber + snumber ;
        System.out.print("Sum Is : "+sum );


    }
}
