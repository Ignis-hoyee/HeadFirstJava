package methodAndVariables;

public class Foo {
    int a = calcArea(7, 12);
    //先不用在意这一行

    int calcArea (int height, int width) {
        return height * width;
    }

    public static void main(String[] args) {
        Foo f = new Foo();
        System.out.println(f.calcArea(5,2));
    }
}
//用来测试猜想
