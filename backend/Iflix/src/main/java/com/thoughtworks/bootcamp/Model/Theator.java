package com.thoughtworks.bootcamp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Theator {

	@Id
	long id;
	@NotNull
	String name;
	@NotNull
	String venue;

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

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public Theator(long id, String name, String venue) {
		super();
		this.id = id;
		this.name = name;
		this.venue = venue;
	}

	public Theator() {

	}

	@Override
	public String toString() {
		return "Theator [id=" + id + ", name=" + name + ", venue=" + venue + "]";
	}

}
