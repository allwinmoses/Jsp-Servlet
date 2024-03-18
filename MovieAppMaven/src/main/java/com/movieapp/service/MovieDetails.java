package com.movieapp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieDetails {
	public List<String> showMovies(String language){
		List<String> movies = null;
		
		if(language.equals("English"))
			movies = Arrays.asList("Iron Man","Thor","Avenger");
		if(language.equals("Tamil"))
			movies =  Arrays.asList("Master","Bigil","Sarkar");
		if(language.equals("Kannada"))
			movies =  Arrays.asList("KGF","KGF2");
		if(language.equals("Hindi"))
			movies =  Arrays.asList("Jawan","Dhoni");
		return movies;
	}
	

}
