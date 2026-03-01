import java.util.Scanner;
class TriangleArea{
    public static void main(String[]args){
        System.out.println("Calulate The Triangle Area");
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Width:");
        int a=input.nextInt();
        System.out.print("Enter Height: ");
        int b=input.nextInt();
        double area=0.5*a*b;
        System.out.println("Area Of Cicle is: "+ area);
    }
}

