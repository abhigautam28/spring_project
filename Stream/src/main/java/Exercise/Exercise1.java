package Exercise;

import dto.Director;
import dto.Movie;
import service.InMemoryMovieService;
import service.MovieService;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise1 {


    private static final MovieService movieService = InMemoryMovieService.getInstance();
    public static void main(String[] args){
        // Find the number of movies of each director
        final Collection<Movie> movies = movieService.findAllMovies();

        Map<String, Long> y = movies.stream().map(mov -> mov.getDirectors())
                        .flatMap(Collection::stream).collect(Collectors.groupingBy(
                                Director::getName,
                                Collectors.counting())
                );
        y.forEach((name,count) -> System.out.printf("%20s: %3d\n",name,count));
    }
}
