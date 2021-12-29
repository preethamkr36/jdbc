package com.xworkz.jdbc.dto;

public class IcecreamDto {
	private Integer id;
	private String flavour;
	private String name;
	private Integer price;

	public IcecreamDto(Integer id, String flavour, String name, Integer price) {
		super();
		this.id = id;
		this.flavour = flavour;
		this.name = name;
		this.price = price;
	}

	public Integer getId() {
		return id;
	}

	public String getFlavour() {
		return flavour;
	}

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "IcecreamDto [id=" + id + ", flavour=" + flavour + ", name=" + name + ", price=" + price + "]";
	}
}
