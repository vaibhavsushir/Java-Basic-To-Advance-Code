import java.util.Scanner;
class PrintEven {
    public static void main(String[] args) {
        System.out.println("Welcome To Print Even Number\n");
        for( int i=0 ; i <= 100; i++){
            if( i % 2 == 0){
                System.out.println(i);
            }else{
                continue;
            }
        }
    }
}
