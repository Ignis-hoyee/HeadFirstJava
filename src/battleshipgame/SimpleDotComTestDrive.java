package battleshipgame;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        //这里的2是怎么让SilpleDotCom识别到然后和数组做对比的
        String result = dot.checkYourself(userGuess);
    }
}
