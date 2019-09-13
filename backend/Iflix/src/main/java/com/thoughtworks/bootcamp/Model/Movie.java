package com.thoughtworks.bootcamp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	@Id
	long id;
	String name;
	double rating;
	String language;
	String certification;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public Movie(long id, String name, double rating, String language, String certification) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.language = language;
		this.certification = certification;
	}

	public Movie() {
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + ", language=" + language
				+ ", certification=" + certification + "]";
	}

}
