package methodAndVariables;

public class Mix4 {
    int counter = 0;

    public int maybeNew(int index) {
        //[(index < 5), (index < 5), (index < 7), (index < 1)]
        if (index < 5) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int count = 0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        //[(x < 9), (x < 20), (x < 7), (x < 19)
        while (x < 5) {
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;
            count = count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }

}
//P90的拼图题
