import java.util.Scanner;
class OcurrencesArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Array Number Occurence calculator");
        int[] numarray = ArrayUtility.inputArray();
        System.out.print("Enter Number you want to check how many no of time occur: ");
        int num = input.nextInt();
        int occurence = occurence(num,numarray);
        System.out.print("The Number Is Found " + occurence + " times");
    }

    public static int occurence(int num, int[] numarray) {
        int occ=0;
        int i = 0;
        while (i < numarray.length) {
            if (num == numarray[i]) {
                occ++;
            }
            i++;
        }
        return occ;
    }
}

