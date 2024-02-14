package com.groupeisi.jenkins_test.dao;

import com.groupeisi.jenkins_test.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitDAO extends JpaRepository<Produit, Long> {

}