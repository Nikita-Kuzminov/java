class Books {
    String title;
    String author;
}

public class BooksTest {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];

        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();


        myBooks[0].title = "How to speak";
        myBooks[1].title = "How to read";
        myBooks[2].title = "How to cook";

        myBooks[0].author = "Jenny James";
        myBooks[1].author = "Harry Potter";
        myBooks[2].author = "Loke Morris";

        int x = 0;
        while (x < myBooks.length) {
            System.out.println(myBooks[x].title + ", author - " + myBooks[x].author);
            x += 1;


        }
    }
}