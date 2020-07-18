package com.carwash.adminService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.carwash.adminService.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>{

}

