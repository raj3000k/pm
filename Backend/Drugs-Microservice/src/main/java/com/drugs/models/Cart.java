package com.drugs.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="cart")
public class Cart {
	
	@Id
	private String cartId;
	private String username;
	private String drugsId;
	private String drugsName;
	private double drugsCost;
	private int drugsQty;
	private int stockQty;
	private String drugsDescription;
	private double total;
	
	

}
