package methodAndVariables;

public class GoodDog {

    private int size;

    public void setSize(int s) {
        size = s;
    }

    public int getSize() {
        return size;
    }

    void bark() {
        if (size > 60) {
            System.out.println("woof! woof!");
        } else if (size > 14) {
            System.out.println("Ruff! RUff!");
        }else {
            System.out.println("Yip!");
        }
    }
}
