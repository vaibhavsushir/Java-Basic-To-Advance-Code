import java.util.Scanner;
class IsSortedArray {
    public static void main(String[]args){
        System.out.println("Welcome To Array Sorting Check Post\n");
        int[] numarray=ArrayUtility.inputArray();
        boolean IsInc = IsIncreasing(numarray);
        boolean IsDec= IsDecreasing(numarray);
        if(IsInc || IsDec){
            System.out.println("Array Is Sorted");
        }else{
            System.out.println("Array Is Not Sorted");
        } 
    }
    public static boolean IsIncreasing(int[] numarray){
        int i=1;
        while(i < numarray.length){
        if(numarray[i] < numarray[i-1]){
            return false;
        }
        i++;
    }
        return true ;
    }
    public static boolean IsDecreasing(int[] numarray) {
        int i = 1;
        while (i < numarray.length) {
            if (numarray[i] > numarray[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
