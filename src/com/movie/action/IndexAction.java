package com.movie.action;

import java.util.*;

import com.movie.entity.*;
import com.movie.service.MovieService;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport {
	private MovieService service;
	private List<Movie> movieList;
	private List<Type> typeList;
	private Movie movie;
	private Type type;
	private String keyword;
	private String types;

	public String index() {
		this.movieList = service.findAll();
		this.typeList = service.typeList();
		return "success";
	}

	public String search() {
		this.movieList = service.search(keyword, types);
		System.out.println(types);
		this.typeList = service.typeList();
		return "success";
	}

	public String delete() {
		service.delete(movie);
		return "success";
	}

	public String add() {
		service.add(movie);
		return "success";
	}

	public MovieService getService() {
		return service;
	}

	public void setService(MovieService service) {
		this.service = service;
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public List<Type> getTypeList() {
		return typeList;
	}

	public void setTypeList(List<Type> typeList) {
		this.typeList = typeList;
	}

	public String getTypes() {
		return types;
	}

	public void setTypes(String types) {
		this.types = types;
	}

}
