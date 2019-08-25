package com.sandeep.MovieInfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandeep.MovieInfo.bean.ResponseWrapper;
import com.sandeep.MovieInfo.repository.MovieRepository;

@RestController
@RequestMapping(value="/movieinfo")
public class MovieController {
	
	@Autowired
	MovieRepository movieRepository;
	
	@GetMapping(value="/{userId}")
	public ResponseWrapper getMovieInfo(@PathVariable(name="userId") int userId)
	{
		ResponseWrapper response=new ResponseWrapper();
		response.setMovieInfoList(movieRepository.findAll());
		return response;
	}

}
