package com.xworkz.jdbc.dto;

public class WaterfallsDto {
	private Integer id;
	private String name;
	private String location;
	private Double height;
	private String river;

	public WaterfallsDto(Integer id, String name, String location, Double height, String river) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.height = height;
		this.river = river;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public Double getHeight() {
		return height;
	}

	public String getRiver() {
		return river;
	}

	@Override
	public String toString() {
		return "WaterfallsDto [id=" + id + ", name=" + name + ", location=" + location + ", height=" + height
				+ ", river=" + river + "]";
	}
}