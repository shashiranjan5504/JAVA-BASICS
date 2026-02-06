class Indexof {
    public static void main(String[] args) {
        String str = "karnataka";
        System.out.println(str.indexOf('n'));
        System.out.println(str.indexOf('t'));
        System.out.println(str.indexOf('h'));


        int a = str.indexOf('a');
        System.out.println(a);
        int b = str.indexOf('a', a + 1);
        System.out.println(b);
        int c = str.indexOf('a', b + 1);
        System.out.println(c);
        int d = str.indexOf('a', c + 1);
        System.out.println(d);




    }    
}
