package dev.patika.movieapispringboot.movie.repository;

import java.util.List;

public interface MovieDao {

    MovieEntity save(MovieEntity entity);

    MovieEntity retrieve(Long id);

    List<MovieEntity> retrieveByActorId(Long actorId);
}
