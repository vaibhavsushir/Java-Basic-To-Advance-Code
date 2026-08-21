
class SumAverage2DArray{
    public static void main(String[] args){
        System.out.println("Welcom To Calculate Sum And Average Of 2D Array\n");
        int[][] numarray = ArrayUtility.input2DArray();
        long sum = Sum(numarray);
        double average =Average(numarray); 
        System.out.println("Your Sum of Array is: "+sum);
        System.out.println("Your Average Of Array Is:"+average);
    }
    public static double Average(int[][] numarray){
        if(numarray.length == 0){
            return 0;
        }
        int rows = numarray.length;
        int col = numarray[0].length;
        double size = rows*col;
        return Sum(numarray) / size ;
    }
    public static long Sum(int[][] numarray){ 
        long sum=0;
        int i=0;
        while(i < numarray.length){
            int j=0;
            while(j < numarray[i].length){
                sum = sum + numarray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
