package com.devsuperior.sdsdsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.sdsdsmeta.entities.Sale;
import com.devsuperior.sdsdsmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	
	
	public List<Sale>findSales() {
		return repository.findAll();
		
	}

}
