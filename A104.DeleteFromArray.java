import java.util.Scanner;
class DeleteFromArray {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in); 
        System.out.println("Welcome To Array Deletion\n");
        int[] numarray=ArrayUtility.inputArray();
        System.out.print("Enter The Element You Want To Delete: ");
        int numtodelete=input.nextInt();
        System.out.println("Here Is Your New Array");
    }
    }

