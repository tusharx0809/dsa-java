class Binarysearch {
    public static int binarysearch(int[] arr, int num){
        int l = 0;
        int r = arr.length - 1;

        while(l <= r){
            int m = l + (r-l) / 2;
            if(arr[m] == num){
                return m;
            }else if(arr[m] < num){
                l = m+1;
            }else{
                r = m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int searchNum1 = 3;
        int searchNum2 = 6;

        int result1 = binarysearch(arr, searchNum1);
        int result2 = binarysearch(arr, searchNum2);

        System.out.println("Search for " + searchNum1 + ": " + (result1 != -1 ? "Found at index " + result1 : "Not found")); //Search for 3: Found at index 2
        System.out.println("Search for " + searchNum2 + ": " + (result2 != -1 ? "Found at index " + result2 : "Not found")); //Search for 6: Not found
    }
}
