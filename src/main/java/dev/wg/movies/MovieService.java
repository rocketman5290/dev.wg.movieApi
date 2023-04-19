package dev.wg.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class MovieService {
    @Autowired //let spring instantiate below class for us
    private MovieRepository movieRepository;
    public List<Movie> allMovies() {
        return movieRepository.findAll();
    }

}
