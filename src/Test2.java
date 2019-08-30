public class Test2 {
    public static void main(String[] args) {
        String Str1 = "runoob";
        String Str2 = Str1;
        String Str3 = "Runoob";
        boolean retVal;
        retVal = Str1.equals(Str2);
        System.out.println("返回值= " + retVal);
        retVal = Str2.equals(Str3);
        System.out.println("返回值= " + retVal);

    }
}
