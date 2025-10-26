class insertionsort  {
    public static int[] insertionsorting(int[] arr){
        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j >=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {7,3,5,1,2,6,8,9,4};

        int[] sortedArr = insertionsorting(arr);

        System.out.print("SortedArray: [ ");
        for(int i=0; i<sortedArr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        //[ 1 2 3 4 5 6 7 8 9 ]
    }
}
