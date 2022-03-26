package com.mycscode.sms.login.service;

import com.mycscode.sms.login.model.loginUser;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

@Service
public interface loginService extends MongoRepository<loginUser, String>{
    
}
