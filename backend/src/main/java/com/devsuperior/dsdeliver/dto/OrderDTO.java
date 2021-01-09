package com.devsuperior.dsdeliver.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dsdeliver.entities.Order;
import com.devsuperior.dsdeliver.entities.OrderStatus;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class OrderDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String address;
	private Double latitude;
	private Double longitude;
	private Instant moment;
	private OrderStatus status;
	
	private List<ProductDTO> products = new ArrayList<>();
	
	public OrderDTO() {
		
	}
	
	public OrderDTO(Order entity) {
		id = entity.getId();
		address= entity.getAddress();
		latitude= entity.getLatitude();
		longitude= entity.getLongitude();
		this.moment= entity.getMoment();
		this.status= entity.getStatus();
		this.products = entity.getProducts().stream()
				.map(x->new ProductDTO(x)).collect(Collectors.toList());
	} 
	
}
