package com.zensar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BusRouteEntity {

	@Id
	private int id;
	private String title;
	private String source;
	private String destination;
	private String stations;

	public BusRouteEntity() {
		super();
	}

	public BusRouteEntity(int id, String title, String source, String destination, String stations) {
		super();
		this.id = id;
		this.title = title;
		this.source = source;
		this.destination = destination;
		this.stations = stations;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getStations() {
		return stations;
	}

	public void setStations(String stations) {
		this.stations = stations;
	}

	@Override
	public String toString() {
		return "BusRouteEntity [id=" + id + ", title=" + title + ", source=" + source + ", destination=" + destination
				+ ", stations=" + stations + "]";
	}

}
