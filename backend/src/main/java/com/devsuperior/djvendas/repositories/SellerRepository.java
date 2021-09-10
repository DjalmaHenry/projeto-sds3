package com.devsuperior.djvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.djvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
