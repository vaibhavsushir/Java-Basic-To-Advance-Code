import java.util.Scanner;
class OccurencesForEach {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To Finding Occurences\n");
        int [] nums = ArrayUtility.inputArray();
        System.out.print("Enter Number You Want To Search: ");
        int element = input.nextInt();
        int occurence = occurences(nums,element);
        System.out.println("Number Of Occurences Is : "+ occurence +" Times");
    }
    
    public static int occurences(int[] nums,int element){
        int occ = 0;
        for(int num : nums){
            if ( num == element){
                occ++;
            }
        }
        return occ;
    }
}
