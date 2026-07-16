import java.util.Scanner;
class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome To Palindrome Checker\n");
        int[] numarr = ArrayUtility.inputArray();
        boolean ispalin = IsPalindrome(numarr);
        if(ispalin){
            System.out.println("Your Array Is Palindrome");
        }else {
            System.out.println("Your Array Is Not Palindrome");
        }
    }
    
    public static boolean IsPalindrome(int[] numarr){
        int i = 0;
        while(i < numarr.length/2){
            if(numarr[i] == numarr[(numarr.length-1)-i]){
                i++;;
            }
        }
        return true;
    }
}
