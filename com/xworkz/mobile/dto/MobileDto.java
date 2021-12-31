package com.xworkz.mobile.dto;

public class MobileDto {
	private Integer id;
	private String name;
	private String model;
	private String serialNumber;
	private Integer price;
	private Integer noOfCamera;
	private Integer memory;

	public MobileDto(Integer id, String name, String model, String serialNumber, Integer price, Integer noOfCamera,
			Integer memory) {
		super();
		this.id = id;
		this.name = name;
		this.model = model;
		this.serialNumber = serialNumber;
		this.price = price;
		this.noOfCamera = noOfCamera;
		this.memory = memory;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getModel() {
		return model;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public Integer getPrice() {
		return price;
	}

	public Integer getNoOfCamera() {
		return noOfCamera;
	}

	public Integer getMemory() {
		return memory;
	}

}