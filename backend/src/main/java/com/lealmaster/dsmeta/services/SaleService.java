package com.lealmaster.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lealmaster.dsmeta.entities.Sale;
import com.lealmaster.dsmeta.repositories.SaleRepositories;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepositories repository;

	public List<Sale> findSales() {
		return repository.findAll();
	}
}
