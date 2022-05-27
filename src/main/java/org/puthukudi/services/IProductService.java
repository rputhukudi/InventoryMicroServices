package org.puthukudi.services;

import java.util.List;

import org.puthukudi.model.Product;

public interface IProductService {
	List<Product> findAll();  
}
