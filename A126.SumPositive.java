import java.util.Scanner;
class SumPositive {
    public static void main(String[] args) {
        
        System.out.println("Welcome To Sum Of Positive Number\n");
        int[] numarr = ArrayUtility.inputArray();

        int sum = 0;
        for( int num : numarr){
            if ( num < 0){
                continue;
            }else{
                sum += num ; 
            }
        }
        System.out.println("Sum Of Positive Number Is: "+ sum);
    }
}
