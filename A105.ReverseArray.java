class ReverseArray{
    public static void main(String[]args){
        System.out.println("Welcome To Array Reversal\n");
        int[] numarray=ArrayUtility.inputArray();
        reverse(numarray);
        System.out.println("Your Reverse Array Is: ");
        ArrayUtility.displayArray(numarray);
    }
    public static void reverse(int[] arr){
        int i=0;
        while(i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1)-i];
            arr[(arr.length-1)-i] = swap;
            i++;
        }
    }
}
