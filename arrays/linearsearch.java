class LinearSearch {
    public static int linearSearch(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;  
            }
        }
        return -1; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int searchNum1 = 3;
        int searchNum2 = 6;

        int result1 = linearSearch(arr, searchNum1);
        int result2 = linearSearch(arr, searchNum2);

        System.out.println("Search for " + searchNum1 + ": " + (result1 != -1 ? "Found at index " + result1 : "Not found")); //Search for 3: Found at index 2
        System.out.println("Search for " + searchNum2 + ": " + (result2 != -1 ? "Found at index " + result2 : "Not found")); //Search for 6: Not found
    }
}
