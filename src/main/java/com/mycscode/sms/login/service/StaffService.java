package com.mycscode.sms.login.service;

import com.mycscode.sms.login.model.Staffs;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface StaffService extends MongoRepository<Staffs, Integer>{
    
}
