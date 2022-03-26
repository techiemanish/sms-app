package com.mycscode.sms;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class RootController {
    
    @GetMapping("/")
    public ResponseEntity<String> root(){
        return ResponseEntity.status(HttpStatus.OK).body("School Management System v1.0");
    }
}
