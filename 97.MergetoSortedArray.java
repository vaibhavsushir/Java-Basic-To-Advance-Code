class MergetoSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome To Merge Two Sorted Array\n");
        int[] arr1 = ArrayUtility.inputArray();
        int[] arr2= ArrayUtility.inputArray(); 
        int[] mergearr = merge(arr1,arr2);
        System.out.println("Your Merge Array Is: ");
        ArrayUtility.displayArray(mergearr);
    } 
    
    public static int[] merge(int[] arr1,int[] arr2){
        int newsize = arr1.length + arr2.length;
        int[] newarr = new int[newsize];
        int i = 0,j=0,k=0; 
  
        while(i < arr1.length || i < arr2.length){
            if(j == arr2.length || (i < arr1.length) && arr1[i] < arr2[j]){
                newarr[k] = arr1[i] ;
                i++;
                k++;
            }else{
                newarr[k] = arr2[j] ;
                j++;
                k++;
            }
        }
        return newarr;
    }
}
