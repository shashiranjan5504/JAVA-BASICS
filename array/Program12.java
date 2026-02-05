class Program12 {
    public static void main(String[] args) {
        int[] arr = { 13, 10, 12, 15, 14, 11 };
        int large = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
        }
        System.out.println("array largest :"+large);
    }
    
}
