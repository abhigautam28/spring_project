package service;

import dto.Director;
import dto.Genre;
import dto.Movie;
import model.CriteriaBean;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author Binnur Kurt (binnur.kurt@gmail.com)
 */
public interface MovieService {
	Movie findMovieById(int id);

	Collection<Movie> findAllMovies();

	Collection<Movie> findAllMoviesByYearRange(int fromYear, int toYear);

	Collection<Movie> findAllMoviesByDirectorId(int directorId);

	Collection<Movie> findAllMoviesByYearRangeAndGenre(String genre,
			int fromYear, int toYear);

	Collection<Movie> findAllMoviesByGenre(String genre);
	Collection<Movie> findAllMoviesByCriteria(CriteriaBean criteria);

	Movie addMovie(int id, String title, int year, String imdb,
			List<Genre> genres, List<Director> directors);

	Genre findGenreByName(String genre);

	Collection<Genre> findAllGenres();

	Collection<Director> findAllDirectors();
}
