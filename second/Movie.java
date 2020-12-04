class Movie {
    String title;
    String genre;
    int rating;
    void playIt() {
        System.out.println("Film playing");
    }
}
public class MoveiTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "How to burn on sales";
        one.genre = "Drama";
        one.rating = -2;
        Movie two = new Movie();
        two.title = "Lost in the office";
        two.genre = "Comedy";
        two.rating = 5;
        Movie three = new Movie();
        three.title = "Byte-club";
        three.genre = "Drama, and comedy";
        three.rating = 127;
    }
}