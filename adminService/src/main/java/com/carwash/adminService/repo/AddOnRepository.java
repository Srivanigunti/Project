package com.carwash.adminService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carwash.adminService.entity.AddOn;


@Repository
public interface AddOnRepository extends MongoRepository<AddOn, Long>{

	
}