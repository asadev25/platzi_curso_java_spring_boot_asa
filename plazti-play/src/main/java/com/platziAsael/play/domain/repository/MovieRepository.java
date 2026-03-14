package com.platziAsael.play.domain.repository;

import com.platziAsael.play.domain.dto.MovieDto;
import com.platziAsael.play.domain.dto.UpdateMovieDto;

import java.util.List;

public interface MovieRepository {
    List<MovieDto> getAll();
    MovieDto getById(long id);
    MovieDto save(MovieDto movieDto);
    MovieDto update(long id, UpdateMovieDto updateMovieDto);
    MovieDto delete(long id);
}
