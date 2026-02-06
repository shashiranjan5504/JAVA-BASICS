class ContainsStartsWithEndsWith {
    public static void main(String[] args) {
        String str = "Engineering";
        //contains()
        
        System.out.println(str.contains("job"));
        System.out.println(str.contains("gin"));

        //startsWith()
        System.out.println(str.contains("eng"));
        System.out.println(str.contains("Engine"));

        //endsWith()
        System.out.println(str.contains("r ing"));
        System.out.println(str.contains("ing"));




    }
}
