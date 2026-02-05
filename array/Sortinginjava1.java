
//code to sort  the array in ascending order

class Sortinginjava1 {
    static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
     }
    public static void main(String[] args) {

        int[] arr = { 13, 10, 15, 14, 18, 16 };
        System.out.println("Before Sorting");
        display(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;

                }
            }
        }
        System.out.println("After Sorting");
        display(arr);
    
}    
}
