class LastIndexOf {
   
    public static void main(String[] args) {
        String str = "Developer";
        System.out.println(str.lastIndexOf('p'));//it is case sensitive so in the srtring if there is smaall letter only if we search for capital letter it will show -1
        System.out.println(str.lastIndexOf('v'));
        System.out.println(str.lastIndexOf('n'));


        int a = str.lastIndexOf('e');
        System.out.println(a);
        int b = str.lastIndexOf('e', a- 1);
        System.out.println(b);
        int c = str.lastIndexOf('e', b - 1);
        System.out.println(c);
       




    }    
}

