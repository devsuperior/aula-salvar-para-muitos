package com.devsuperior.aula.dto;

import java.util.ArrayList;
import java.util.List;

import com.devsuperior.aula.entities.Category;
import com.devsuperior.aula.entities.Product;

public class ProductDTO {

	private Long id;
	private String name;
	private Double price;
	
	private List<CategoryDTO> categories = new ArrayList<>();
	
	public ProductDTO() {
	}

	public ProductDTO(Long id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		price = entity.getPrice();
		for (Category cat : entity.getCategories()) {
			categories.add(new CategoryDTO(cat));
		}
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public List<CategoryDTO> getCategories() {
		return categories;
	}
}
