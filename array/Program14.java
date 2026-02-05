class Program14 {
    public static void main(String[] args) {
        int[] arr = { 11, 13, 14, 16, 15, 12, 14, 18 };
        int element = 14;
        boolean present = false;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                System.out.println(element + " found at index " + i);
                present = true;
            }
            //loop ke andra else likhne se galat output aa jata hai thats why we use flagg  present to denote the whther the number is present in the array or noot 
        }
        if (present == false) {
            System.out.println(element +" not found in the array");
        }
    }    
}
