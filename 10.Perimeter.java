import java.util.Scanner;
class Perimeter {
    public static void main(String[]args){
        System.out.println("Welocme To Perimeter Calculator");
        System.out.println("Enter All Four Sides");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        int d=input.nextInt();
       int perimeter=a+b+c+d;
        System.out.println("Perimeter Of Squre Is: "+perimeter+
                " cm");

    }
}
