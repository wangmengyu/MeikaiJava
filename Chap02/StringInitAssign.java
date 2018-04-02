class StringInitAssign{
    public static void main(String args[]) {
        String s1 = "ABC";
        String s2 = "DEF";
        s1 = "FBI"; //改写引用对象
        System.out.println("字符串s1:" + s1);
        System.out.println("字符串s2:" + s2);
    }
}