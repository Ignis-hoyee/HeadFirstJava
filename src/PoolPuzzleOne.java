public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        while (x < 4){
            x = x + 2;
            if(x < 1){
                System.out.print("noise");
            }
            x = x - 1;
            if( x > 1){
                System.out.println();
            }
        }
    }
}
