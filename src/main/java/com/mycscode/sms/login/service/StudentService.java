package com.mycscode.sms.login.service;

import com.mycscode.sms.login.model.Students;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentService extends MongoRepository<Students, Integer>{
    
}
