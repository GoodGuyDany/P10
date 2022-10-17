// 2.1
public class Movie{
public String name;
public int year;
public int rating;
public Movie(String name, int year, int rating){
    this.name = name;
    this.year = year;
    this.rating = rating;
}
// 2.1.4
public void printMovie(){
    System.out.println("The movie name is: " + name + " The movie release year is: " + year + " The movie's rating is: " + rating);
}
} // Movie

