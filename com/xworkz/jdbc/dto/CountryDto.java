package com.xworkz.jdbc.dto;

public class CountryDto {
	private Integer id;
	private String name;
	private Integer code;
	private String continent;

	public CountryDto(Integer id, String name, Integer code, String continent) {
		super();
		this.id = id;
		this.name = name;
		this.code = code;
		this.continent = continent;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public String getContinent() {
		return continent;
	}

	@Override
	public String toString() {
		return "CountryDto [id=" + id + ", name=" + name + ", code=" + code + ", continent=" + continent + "]";
	}
}