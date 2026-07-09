import java.util.Scanner;
class MaxMinArray {
    public static void main(String[]args) { 
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Find Maximum And Minimum Number Finder "); 
        int[] numarray=ArrayUtility.inputArray();
        int max = max(numarray);
        System.out.println("Maximum Number Is "+max);
        int min = min(numarray);
        System.out.println("Manimum Number Is "+min);
    } 
    
    public static int max(int[] numarray) {
        if(numarray.length == 0){
            return Integer.MIN_VALUE; 
        } 
        int max = numarray[0];
        int i=1;  
        while(i < numarray.length){
            if( max < numarray[i] ){
                max = numarray[i];
            }
            i++;
        }
        return max;
    }
    public static int min(int[] numarray) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i < numarray.length) {
            if (min > numarray[i]) {
                min = numarray[i];
            }
            i++;
            ;
        }

        return min;
    }
}
