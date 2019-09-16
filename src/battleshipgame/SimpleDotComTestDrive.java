package battleshipgame;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        int numOfGuess = 0;
        GameHelper helper = new GameHelper();
        //GameHelper类尚未创建
        SimpleDotCom theDotCom = new SimpleDotCom();

        int randomNum = (int) (Math.random() * 4);
        /**Math.random会返回一个介于0到小于1之间的数，所
         *以这个公式会产生介于0~4之间的数值。
         */
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number: ");
            //helper.getUserInput为GameHelper的方法，尚未创建。
            String result = theDotCom.checkYourself(guess);
            numOfGuess++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuess + " guesses");
            }
        }
    }
}
