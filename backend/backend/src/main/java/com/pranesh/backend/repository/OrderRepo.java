package com.pranesh.backend.repository;

import com.pranesh.backend.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders, Integer> {

}