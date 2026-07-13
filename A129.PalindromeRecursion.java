import java.util.Scanner;
class PalindromeRecursion {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Palindrome Checker\n");
        System.out.print("Enter String You Want To Be Check: ");
        String str = input.next();
        System.out.println("Your String Is " + (IsPalindrome(str) ? "Palindrome" : "Not Palindrome"));

    }
    public static boolean IsPalindrome(String str){
        if(str.length() <= 1){
            return true;
        }
        int lastpos = str.length() - 1;
        if( str.charAt(0) != str.charAt(lastpos)){
            return false;
        }
        String newstr = str.substring(1,lastpos);

        return IsPalindrome(newstr);
    }
}
