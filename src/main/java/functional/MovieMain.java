package functional;

/*
* Create a Functional interface ResearchMethodology with method research
* Implement the interface as Lambda Expression
*
* */

public class MovieMain {
    public static void main(String[] args) {
        Movie horrorMovieWatcher= (hallName) -> System.out.println("I will watch Horror Movie in " + hallName);
        horrorMovieWatcher.watchMovie("FCube");
    }
}
