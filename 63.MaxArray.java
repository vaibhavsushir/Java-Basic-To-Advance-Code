import java.util.Scanner;
class MaxArray {
    public static void main(String[] args) {
        System.out.println("Welcome To Finding Maximum Integer\n");
        int[] arr = ArrayUtility.inputArray();
        int max = Integer.MIN_VALUE;
        for( int num: arr){
            if( max < num){
                max = num;
            }
        }
        System.out.println("Maximum Number Is: "+ max );



    }
}
