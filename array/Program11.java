class Program11{
    
    public static void main(String[] args) {
        int[] arr = { 13, 10, 14, 15, 12, 11 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           
                sum = sum + arr[i];
        }
        
        double average=sum/arr.length;
        System.out.println("Array Average  :"+average );
    }
}
 
    

