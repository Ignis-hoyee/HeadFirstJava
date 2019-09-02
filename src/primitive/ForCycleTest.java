package primitive;

public class ForCycleTest {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int size = numbers.length;
        for (int i=0; i<size; i++) {
            int x = numbers [i];
            System.out.print(x + ",");
        }
        /** for (int x : numbers){
         *      System.out.print(x + ",");
         *  }
         */
    }
}
