package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.dto.CategoryDTO;
import com.devsuperior.aula.dto.ProductDTO;
import com.devsuperior.aula.entities.Category;
import com.devsuperior.aula.entities.Product;
import com.devsuperior.aula.repositories.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductDTO insert(ProductDTO dto) {

    	Product entity = new Product();
    	
    	entity.setName(dto.getName());
    	entity.setPrice(dto.getPrice());
    	
    	for (CategoryDTO catDto : dto.getCategories()) {
    		Category cat = new Category();
    		cat.setId(catDto.getId());
    		entity.getCategories().add(cat);
    	}
    	
    	entity = repository.save(entity);
    	
    	return new ProductDTO(entity);
    }
}
