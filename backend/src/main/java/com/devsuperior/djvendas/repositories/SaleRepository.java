package com.devsuperior.djvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.djvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
