package primitive;

public class Try {
    public static void main(String[] args) {
        TrySource d = new TrySource();
        int y = d.x;
        short s;
        int g = 23;
        int p = 3 * g + y;
        System.out.println(y);
        System.out.println(p);
    }
}
