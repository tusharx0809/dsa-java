package arrays;

public class bubblesort {
    public static int[] bubblesort(int[] arr){
        int n = arr.length;
        boolean swapped;

        for(int i=0; i<n-1; i++){
            swapped = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }

        return arr;
    }
    public static void main(String[] args){
        int[] arr = {7,3,5,1,2,6,8,9,4};

        int[] sortedArr = bubblesort(arr);

        System.out.print("SortedArray: [ ");
        for(int i=0; i<sortedArr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
        //[ 1 2 3 4 5 6 7 8 9 ]
    }
}
