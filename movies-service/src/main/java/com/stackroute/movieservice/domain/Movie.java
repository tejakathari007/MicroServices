package com.stackroute.movieservice.domain;





import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


//@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Movie {
	@Id
	private int movieId;
	private String movieName;
	private String movieDesc;
	private int movieYear;



}
