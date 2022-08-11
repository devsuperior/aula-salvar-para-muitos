package com.devsuperior.aula.repositories;

import com.devsuperior.aula.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
