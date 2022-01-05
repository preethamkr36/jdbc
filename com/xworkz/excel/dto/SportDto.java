package com.xworkz.excel.dto;

public class SportDto {
	private Double id;
	private String sport;
	private String player;
	private String country;
	private Double age;

	public SportDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SportDto(Double id, String sport, String player, String country, Double age) {
		super();
		this.id = id;
		this.sport = sport;
		this.player = player;
		this.country = country;
		this.age = age;
	}

	public Double getId() {
		return id;
	}

	public void setId(Double id) {
		this.id = id;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Double getAge() {
		return age;
	}

	public void setAge(Double age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "SportDto [id=" + id + ", sport=" + sport + ", player=" + player + ", country=" + country + ", age="
				+ age + "]";
	}

}