import java.util.Scanner;
class FehrenheitToCelsius {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Welcome To Temperature Converter/n");
        System.out.print("Enter Fehrenheit Temperature:");
        float a=input.nextInt();
        float temp=(a-32)*5/9;;
        System.out.println("Temperature In Celsius: "+ temp+" cel");
    }
}

