package com.xworkz.jdbc.dto;

public class FestivalDto {
	private int id;
	private String name;
	private String date;
	private String state;

	public FestivalDto(int id, String name, String date, String state) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.state = state;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDate() {
		return date;
	}

	public String getState() {
		return state;
	}

	@Override
	public String toString() {
		return "FestivalDto [id=" + id + ", name=" + name + ", date=" + date + ", state=" + state + "]";
	}

}