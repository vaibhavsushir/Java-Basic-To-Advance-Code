
class DiagonalSum2DArray {
    
    public static void main(String[] args) {
        System.out.println("Welcome To Sum Of Diagonal");
        int[][] numarray = ArrayUtility.input2DArray();
        long sum = sumofdiagonals(numarray);
        System.out.println("Sum Of diagonals Is: "+ sum);
    }
    public static long sumofdiagonals(int[][] numarray){
        long leftsum = sumofleftdiagonals(numarray);
        long rightsum = sumofrightdiagonals(numarray);
        long sum = leftsum + rightsum;
        if( numarray.length % 2 != 0){
        int ind = numarray.length / 2 ;
        sum -= numarray[ind][ind];
        }
        return sum; 
    }
    
    public static long sumofleftdiagonals(int[][] numarray){
        long sum = 0;
        int i = 0;
        while( i < numarray.length){
            sum += numarray[i][i] ;
            i++;
        }
        return sum;
    }
    public static long sumofrightdiagonals(int[][] numarray){
        long sum = 0;
        int i=0;
        while( i <numarray.length){
        int col = numarray.length -1-i;
        sum += numarray[i][col];
            i++;
        }
        return sum;
    }
}
