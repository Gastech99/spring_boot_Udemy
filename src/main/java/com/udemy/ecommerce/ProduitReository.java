package com.udemy.ecommerce;

import org.springframework.data.jpa.repository.JpaRepository;

import com.udemy.ecommerce.entities.PRODUIT;

public interface ProduitReository extends JpaRepository<PRODUIT, Long> {

}
