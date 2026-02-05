class Program13 {
    public static void main(String[] args) {
        int[] arr = { 13, 10, 12, 15, 14, 11 };
        int lowest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        System.out.println("Array Lowest :"+lowest);
    }
}
