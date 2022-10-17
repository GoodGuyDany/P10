// Part 2
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movies movies = new Movies();
//        movies.addMovie(new Movie("The Shining", 1986, 9));
//        movies.addMovie(new Movie("Titanic", 1968, 10));
//        movies.addMovie(new Movie("Sonic", 2021, 4));
//        movies.addMovie(new Movie("Avengers", 2004, 10));
//        movies.addMovie(new Movie("Ant-Man", 2005, 8));
//        movies.addMovie(new Movie("Isaac", 2001, 9));
//        movies.printMovies();
//        System.out.println();
//        movies.findMovieByInt("0");
//        movies.sortMovies();
//        System.out.println();
//        movies.printMovies();
        boolean go = true;
        while (go){
            System.out.println("What would you like to do?");
            System.out.println("1 - add movies to collection");
            System.out.println("2 - print all movies");
            System.out.println("3 - sort movies by year");
            System.out.println("4 - search movies by title");
            System.out.println("5 - search movies by year");
            System.out.println("0 - exit the program");
            String ans = sc.nextLine();
            switch (ans){
                case "1":
                    System.out.println("Please input movie name:");
                    String name = sc.nextLine();
                    System.out.println("Please input year when movie was released:");
                    int year = sc.nextInt();
                    System.out.println("Please input rating of the movie:");
                    int rating = sc.nextInt();
                    sc.nextLine();
                    movies.addMovie(new Movie(name, year, rating));
                    break;
                case "2":
                    movies.printMovies();
                    break;
                case "3":
                    movies.sortMovies();
                    break;
                case "4":
                    System.out.println("Please input the searchkey:");
                    String searchkey = sc.nextLine();
                    movies.findMovie(searchkey);
                    break;
                case "5":
                    System.out.println("Please input the year");
                    String searchyear = sc.nextLine();
                    movies.findMovieByInt(searchyear);
                    break;
                case "0":
                    System.out.println("See you soon!");
                    go = false;
                    break;
                default:
            }
        }
    }
} // Main2
