class Program9 {
    
    public static void main(String[] args) {
        int[] arr = { 13, 10, 14, 15, 12, 11 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("Array sum  of even number :"+sum);
    }
}
 
    

