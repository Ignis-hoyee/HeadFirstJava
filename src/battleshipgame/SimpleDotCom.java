package battleshipgame;

public class SimpleDotCom {

    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }
    public String checkYourself(String stringGuess) {


        int guess = Integer.parseInt(stringGuess);
        //Integer书上说是内建类，但是我想提前理解下
        String result = "miss";

        for (int cell : locationCells) {
            //这里的'cell', ':', 'locationCells'都是怎么运作的？
            /**是一种语法糖，这里的意思是，遍历所有的locationCells里的元
             *素,让cell在循环的开始被元素赋值。
             *这里的for (int cell : locationCells) {
             *  CODE...
             * }
             * 可以写成
             * int size = locationCells.length
             * for (int i=0; i<size; i++) {
             *  int cell = locationCells[i]
             *  CODE....
             * }
             */
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
                //这里的break是不是无论如何都不循环这个if？
                //但是既然不需要循环，为啥还要用if？
            }
        }

        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}