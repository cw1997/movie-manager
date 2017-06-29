package com.movie.service;


import java.util.List;

import com.movie.entity.*;

public class MovieService {
	private MovieDAO movieDao;
	private TypeDAO TypeDao;

	public List<Movie> findAll() {
		return this.getMovieDao().findAll();
	}

	public List<Type> typeList() {
		return this.getTypeDao().findAll();
	}

	public List<Movie> search(String keyword, String types) {
		return this.getMovieDao().search(keyword, types);
	}

	public void delete(Movie movie) {
		this.getMovieDao().delete(movie);
	}

	public void add(Movie movie) {
		this.getMovieDao().save(movie);
	}
	
	

	public MovieDAO getMovieDao() {
		return movieDao;
	}

	public void setMovieDao(MovieDAO movieDao) {
		this.movieDao = movieDao;
	}

	public TypeDAO getTypeDao() {
		return TypeDao;
	}

	public void setTypeDao(TypeDAO typeDao) {
		TypeDao = typeDao;
	}

}
