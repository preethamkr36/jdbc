package com.xworkz.jdbc.dto;

public class CityDto {
	private Integer id;
	private String name;
	private Long population;
	private String famousFor;

	public CityDto(Integer id, String name, Long population, String famousFor) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.famousFor = famousFor;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Long getPopulation() {
		return population;
	}

	public String getFamousFor() {
		return famousFor;
	}

	@Override
	public String toString() {
		return "CityDto [id=" + id + ", name=" + name + ", population=" + population + ", famousFor=" + famousFor + "]";
	}

}