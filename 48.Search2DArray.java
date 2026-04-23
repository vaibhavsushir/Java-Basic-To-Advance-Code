import java.util.Scanner;
class Search2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To 2D Search\n");
        int[][] numarray = ArrayUtility.input2DArray();
        System.out.print("Enter The Number You Want To Search: ");
        int num=input.nextInt();
        boolean isfound = Search(numarray,num);
        if(isfound){
            System.out.println("Your Number Is Found");
        }else{
            System.out.println("Your Number Is Not Found");
        }
    }
    public static boolean Search(int[][] numarray,int num){
        int i=0;
        while(i < numarray.length){
            int j=0;
            while(j < numarray[i].length){
                if(numarray[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }

        return false;
    }
}
