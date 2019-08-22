package primitive;

import java.awt.print.Book;

public class BookTestDrive {
    public static void main(String[] args) {

        Books [] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "不在摸鱼";
        myBooks[1].title = "C语言开发";
        myBooks[2].title = "PHP&mySQL开发";
        myBooks[0].author = "布哥BOOG";
        myBooks[1].author = "谭浩强";
        myBooks[2].author = "unknown";

        while ( x < 3){
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}
