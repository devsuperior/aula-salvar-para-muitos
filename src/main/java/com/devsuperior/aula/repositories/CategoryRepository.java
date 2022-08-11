package com.devsuperior.aula.repositories;

import com.devsuperior.aula.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
