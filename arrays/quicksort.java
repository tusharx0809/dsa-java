class quicksort {
    public static int partition(int[] arr, int l, int h){
        int pivot = arr[h];
        int i = l-1;

        for(int j=l; j<=h-1; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp2 = arr[h];
        arr[h] = arr[i+1];
        arr[i+1] = temp2;

        return i+1;
    }

    public static void quicksorting(int [] arr, int l, int h){
        if(l < h){
            int pi = partition(arr, l, h);
            quicksorting(arr, l, pi-1);
            quicksorting(arr, pi + 1, h);
        }
    }
    public static void main(String[] args){
        int[] arr = {5,1,3,9,7,6,2,4,8};
        int n = arr.length;
        quicksorting(arr, 0, n-1);
        System.out.print("Sorted Array: [ ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }
}
