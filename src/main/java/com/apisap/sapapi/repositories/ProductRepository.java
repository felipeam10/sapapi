package com.apisap.sapapi.repositories;

import com.apisap.sapapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
