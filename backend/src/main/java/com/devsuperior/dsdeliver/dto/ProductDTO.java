package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;

import com.devsuperior.dsdeliver.entities.Product;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private Double price;
	private String description;
	private String imageUri;
	
	public ProductDTO(Product entity) {
		id 				= entity.getId();
		name			= entity.getName();
		price			= entity.getPrice();
		description		= entity.getDescription();
		imageUri		= entity.getImageUri();
	}
	
}
