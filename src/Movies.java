// 2.1
public class Movies{
    // 2.1.2
    private Movie[] movies;
    // 2.1.1
    private int count;
    private int length = 0;
    // 2.1.3
    public void addMovie(Movie m){
        count++;
        Movie[] arr = new Movie[length + 1];
        for (int i = 0; i < arr.length-1; i++){
            arr[i] = movies[i];
        }
        arr[length] = m;
        length++;
        movies = arr;
    }
    // 2.1.4
    public void printMovies(){
        for (int i = 0; i < length; i++){
            movies[i].printMovie();
        }
    }
    // 2.1.5
    public void findMovie(String searchKey) {
        for (int i = 0; i < length; i++)
            if (movies[i].name.contains(searchKey))
                movies[i].printMovie();
    }
    // 2.1.7
    public void findMovieByInt(String searchInt){
        for (int i = 0; i < length; i++){
            String year = String.valueOf(movies[i].year);
            if(year.contains(searchInt)){
                movies[i].printMovie();
            }
        }
    }
    // 2.1.6
    public void sortMovies(){
        boolean isSorted = false;
        int outIterations = 0;
        while(!isSorted){
            isSorted=true;
            for (int j = 0; j < length - outIterations - 1; j++){
                if (movies[j].year > movies[j + 1].year) {
                    isSorted = false;
                    Movie temp = movies[j];
                    movies[j] = movies[j + 1];
                    movies[j + 1] = temp;
                }
            }
            outIterations++;
        }
    }
}
