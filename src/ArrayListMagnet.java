import java.util.ArrayList;
public class ArrayListMagnet {
    public static void printAL(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "zero");
        a.add(1,"one");
        a.add(2,"two");
        a.add(3,"three");
        printAL(a);

        if (a.contains("three")) {
            a.add("four");
        }
        a.remove(2);
        printAL(a);

        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printAL(a);

        if (a.contains("two")){
            a.add("2.2");
        }
        //准确的说不加这段直接多写一次printAL(a)就行了，但是书上似乎要求将所有都用上。。。。这个有什么作用呢……
        printAL(a);
    }
}
