package com.devsuperior.djvendas.dto;

import java.io.Serializable;

import com.devsuperior.djvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
	
	private String sellerName;
	private Double sum;

	public SaleSumDTO() {}

	public SaleSumDTO(Seller seller, Double sum) {
		sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
